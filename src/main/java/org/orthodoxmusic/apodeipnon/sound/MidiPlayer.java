package org.orthodoxmusic.apodeipnon.sound;

import javax.sound.midi.*;

public class MidiPlayer {

    public void play() {
        main(null);
    }

    public static void main(String[] args) {
        try {
// Locate the default synthesizer
            Synthesizer synth = MidiSystem.getSynthesizer();

// Open the synthesizer
            synth.open();

// Get the available Midi channels - there are usually 16
            MidiChannel channels[] = synth.getChannels();

// Get the synth's soundbank where all the sounds are stored
            Soundbank bank = synth.getDefaultSoundbank();

// Load all the available instruments
            synth.loadAllInstruments(bank);

// Get a list of the available instruments
            Instrument instrs[] = synth.getLoadedInstruments();

            Instrument seashore = null;

            for (int i = 0; i < instrs.length; i++) {
                System.out.println(instrs[i].getName());
            }


// Loop through the instruments
            for (int i = 0; i < instrs.length; i++) {

// Stop when you find the seashore
                if (instrs[i].getName().toLowerCase().startsWith("voic")) {
                    seashore = instrs[i];
                    break;
                }
            }

            if (seashore == null) {
                System.out.println("Can't find the beach");
                System.exit(0);
            }

// Get the information describing the Seashore instrument - the
// patch contains the soundbank and program number
            Patch seashorePatch = seashore.getPatch();

// Set 5 channels to use the Seashore instrument
            channels[1].programChange(seashorePatch.getBank(),
                    seashorePatch.getProgram());
            channels[2].programChange(seashorePatch.getBank(),
                    seashorePatch.getProgram());
            channels[3].programChange(seashorePatch.getBank(),
                    seashorePatch.getProgram());

// Start the Seashore note on 3 different channels. By waiting a short
// time before starting the next note, you get a much more continuous sound
            /*
            channels[1].noteOn(32, 90);
            Thread.sleep(3500);
            channels[1].noteOff(32);
            */
            /*
            channels[2].noteOn(42, 90);
            Thread.sleep(1500);
            channels[3].noteOn(52, 90);
            */
            /*
            for(int freqRange = 0;freqRange<16384;freqRange+=1024) {
                play(channels[1], freqRange);
            }
            */
            /*
            play(channels[1],0);
            play(channels[1],8192);
            play(channels[1],16383);
            */
            channels[2].noteOn(65,80);
            music(channels[1],"di",392,4);
            music(channels[1],"ke",441,2);
            channels[2].noteOff(65);
            channels[2].noteOn(62,70);
            music(channels[1],"ga",349,4);
            music(channels[1],"di",392,4);
            music(channels[1],"ga",349,4);
            music(channels[1],"bou",324,4);
            music(channels[1],"pa",294,4);
            music(channels[1],"pa",294,4);
            channels[2].noteOff(62);
            channels[2].noteOn(60,70);
            music(channels[1],"di",392,2);
            music(channels[1],"pa",294,8);
            music(channels[1],"bou",324,8);
            music(channels[1],"ga",349,4);
            music(channels[1],"bou",324,4);
            music(channels[1],"pa",294,4);
            music(channels[1],"ni",262,2);
            channels[2].noteOff(60);

// Wait forever
            for (; ; ) {
                try {
                    Thread.sleep(5000);
                } catch (Exception ignore) {
                }
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void music(MidiChannel channel, String note, int frequency, int ryhtme) {
        int rythmeParam = 2500/ryhtme;
        int midiNote = 0;
        double freqReference = 0;
        double upperReference = 0;
        double downReference = 0;
        switch (note) {
            case "ke":
                midiNote=69;
                freqReference = 440d;
                upperReference =493.883d;
                downReference = 391.995d;
                break;
            case "di":
                midiNote=67;
                freqReference = 391.995d;
                upperReference = 440d;
                downReference = 349.228d;
                break;
            case "ga":
                midiNote=65;
                freqReference = 349.228d;
                upperReference = 391.995d;
                downReference = 311.126d;
                break;
            case "bou":
                midiNote=64;
                freqReference = 329.627d;
                upperReference = 369.994d;
                downReference = 293.664;
                break;
            case "pa":
                midiNote=62;
                freqReference = 293.664d;
                upperReference = 329.627d;
                downReference = 261.625;
                break;
            case "ni":
                midiNote = 60;
                freqReference = 261.625d;
                upperReference = 293.664d;
                downReference = 233.081d;
                break;
        }
        int pitchValue = getPitchValue(freqReference, frequency, upperReference, downReference);
        play(channel, midiNote, pitchValue,rythmeParam);
        System.out.println("note " + note + " fréquence midi " + freqReference + " fréquence byzantine " + frequency + " => correction pitch " + pitchValue );
    }

    private static int getPitchValue(double freqReference, int frequency, double upperReference, double downReference) {
        if(frequency == freqReference) return frequency;
        else if(frequency > freqReference) return getPitchValueForUpperFrequency(freqReference,frequency,upperReference);
        else if(frequency < freqReference) return getPitchValueForDownFrequency(freqReference,frequency,downReference);
        return 0;
    }

    private static int getPitchValueForDownFrequency(double freqReference, int frequency, double downReference) {
        double ecartMidi = freqReference - downReference;
        double freqEcart = freqReference - frequency;
        return 8192 - (int)(8192 * freqEcart / ecartMidi);
    }

    private static int getPitchValueForUpperFrequency(double freqReference, int frequency, double upperReference) {
        double ecartMidi = upperReference - freqReference;
        double freqEcart = frequency - freqReference;
        return 8192 + (int)(8192 * freqEcart / ecartMidi);
    }

    public static void play(MidiChannel channel, int midiNote, int pitchValue, int rythme) {
        try {
            channel.setPitchBend(pitchValue);
            channel.noteOn(midiNote, 90);
            Thread.sleep(rythme);
            channel.noteOff(midiNote);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

