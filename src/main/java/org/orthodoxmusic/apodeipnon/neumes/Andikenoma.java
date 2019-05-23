package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Andikenoma extends Neume {

    private static int ANDIKENOMA_LENGTH = 81;
    private Neume neumeWithAndikenoma;

    public Andikenoma(Neume neumeWithAndikenoma) {
        this.neumeWithAndikenoma = neumeWithAndikenoma;
        height = 13;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + neumeWithAndikenoma.getHeight() + 15;
        //return "<image andikenoma x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"81.6\" height=\"13.12\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAP8AAAApCAYAAAD6b//4AAALL3pUWHRSYXcgcHJvZmlsZSB0eXBl IGV4aWYAAHjarZhrkiM5joT/8xR7hADfPA5BAmZ7gz3+fgipqrt6amZ6bSdVJSlDIT7gDndnJvuf //b0X/zkWXuqbcy+en/4qauuvHkzn8/Pfp/lqe/z++P+/Ux+vZ7y+n6QuVR4LZ9fZ/9eN65n7s/f 6+c7zuZ6+9NAy74f6K8f7O9AeX4n+F7/MVGRzwTPd+C0vwOV/J25fn7Xz7aevub48xbO937/fv6W gf8pnmoZubcuo/Jc8zNGX7yf+amDut1YqJ9PEZp+B/rL7+nHrZk1ZStSHp5zrLCw/DLL5ll4zqXG PTze9zy38ik69Vw5PYP360dd//XPv1p5+rH0L+S/QPrz3V+g/h3S6S3oj1vKXxDqP19/e13aH9fT nyF9cfvTzL1/3+Vfr2t+1i97/oFa/He/090+u9u1s+X+3dSPLcqH2VejWu+3Oo/B//bMKHY8Fo9J Sxx4dCGZ8jiyJAOjS5UrW1zsfT1yWGLNlgevOZ9c5CQuTsBY+bxw13iI51FWuYCfy4EOhav551rk nXa90x2ZTHxlJtgjDCYvQ/4fj/R3bnKPhhKJWgK9fPDN0WmsIpATSY9wG4iIf4va3gL/ePz1J3At INjeMk82uB+NEYBfm/xBrvICXbix8fppYBn3OwAlYgWNxdA2VZ4upUmXZ+SchgiFnAC0WXo0lAKL tJYvi8y1lA44M5iz+c6Q99bc8ucyQggQrfRUBtissgGr1gZ/Rp1waLfSamutt9FmW2330qPDeh89 FHWPMupoo48x5lhjp1lmnW32Oeaca+6VV0Fx26If11xr7c2km5E3397csLdmLVq1adehU5fuk9Mp p552+hlnnnX2zbdc+vj2O+68624Tg0pWrVm3YdOWbYdqXrx68+7Dp6/k+ydqX1j/4fF/QE2+qOUX qbhx/ESNq2P8GEJCTlpgBmK5CoCPQEBKyjkwe6bUmgO5wOxZma5omUW2AOdKIAaC1SQ3l5/Y/YFc S6X/Z3BLAJH/E8ilgO5vIPePuP0OtbtfoysvQtGGUdSn0H3ctPPkH475m9ejt7IIpVqJDcjQzaor K9tbVpXurlZH8d2oJuvv7RZqspm5P0uHNXa3iA1PGe4yxilJO3u/DHSvldFBzk7zg4YNr0wZoYH6 Ncv3Um73Lk7tVxPdRI6sZ773pHHHoZZ8b+5dtVZzYzYDtDNdbm7n5jnyNs99F+eTsVdjvfew9itr obl9JsvzjNaXAB5zrbeKfOFUv50r7GsP6etMLhwhCmGMKvMIg649WP4zzj3pXBt9U/ILbrpMVYr1 WKwa0Lu1qldbXQOiDi8IdHEt2EV10IItce/VtBd1wBzk9uaDqyffDmJjbZaeqVi+XrINxw4pb4Fa Lqvg1DoeuPTo0dklXWaGK9WtrBz1vUUL5WwmXdtTztG+zOY0p0MueGa70ljY8tm1MlJ+IFpa0hve ZfNwxcwP0+3WT63BCZ8xB1VuWvto4osW5yp1W/pZvdO/mxAhFHYOacfG7jcW5fepUJvpsES4W9oD xfcYF4p5m5IL98juCho/s0CCoFADXkm9fpRbvWtHnT0M9Qj8DyCPnUHj2izcmJna3NuedrWY4hWe GLvTiq3y4aWl1qErWPwxawPDRQh2G7L8wMqxx2WRtvWxfRX8Hw8+ZbewbBGvTHtpyKVPFHoQqIbd oHOQoFCbyX4xS/qh1KDyHlptPSgShG/PSoIsyGr2uFH9sWv7TFkhlOD2Shite3WvUMnq9Oiu2UrZ lJNqjkachFopyNwhssybq5XoZ/NG45BlC3eyncZ2xm39pR6KeCAk0FG55iZOe68pDFQAe7ru60Ft yHpYyUWpHfFuOfY6Nuym95UyK7ZSZ0TP2tm2I2BsZCZ2ooYkDMQhH8SpzVLEFMU2WkpZlMPt0ABc l+23pb3fcqDseITN6RAmRfyfuSs7twyF91198g5+Usx6EMG7Kfoe1M6Jsmq0R3PKz9D9XgrntHTN qTFvA/DpeX20Z2OIOaQjFKCQvw5rnHR+jx2Z6CydbSNi1BhcORTREelRlLAvzd0Re0gBO7YB3Myq J8yOAALMuu5tSkgzOXQ1FIbbLPPsgULsm5SlBD0RHYp8giWoPTJwSlZH8lbPnoGCBtwP9k3i9B1q gvxS0FtGhHdPcBW23DPl1sCo8/XG+2EFz1J43rrPSkbqEJ2WI6zWcU6oJmaK8eh64Hs68IW1YQHg fPXAaHkgY8cIui/8jw6k+o1OmMdhPbFqmCLXewS4mGVDzJPDUcqICMMDOkQaZwrIpuQsCDdywRUm 3ImwO7dyM/LCuu1e5OKIIYJUJMkHK/H+eWWkYCOuVMidVYxaX9PdheyAFtHXNsKOj2AbsHxhJHJa iq83LXdNZVnkAGrnHWmsPjAS5JWi0YKrnQy3T73cgoSdHd2o0OMSIczS3meY4WPj0OaOGRUCOprS 0BuC/OlFUegBSuiUPu1VOHxDQ+cJGQFMW5cMWef0YTtw8X44/aKBh5MsrJbQctRzH6YdYNEO7Ufv DCSzNtVAQggKjybm52XRKHyxoJZIBmsUmjfuphvMrCjSHfBnmkQJKmdxpiUt+LSON5W9Ev3cw3zu QuLIUTgbrXWvczBUOsCOGmDTw0pTd9JKdjJWo0EsMtJyJVTPg2aj8ZWw8qJ2MMsFsWnhQlfgj8fu Q0NlexAN/PshabhiNpfWCD2voljFTuj9nXp2IDAzpXBKXwQu08mNFACELfIe1bKwWdPLiZmcQQxd itt1Q+JzUg5Sx6Ok+OyieQ4LQumJ9qe78lVdnWYqtvzFHxVmJghK16NLa1HBpSexIwhKSi2eiW2D rsXJcMCIRRuA9irloDXKvlRiNJy2Ri5hUtKPP5Tz7sSRBBuI4lWO6yRTAhfZlv1vyo5NwWbNFb1D 9zHbHH5b6gWONZFX/sGVndM/z3W/f12F8w0yRTy+qMWNP4LEeCkO3QstJvlTIDwFQVoh3r3Q5g9N RbtYn0sxVIDFYtBeIjPjIGQROrA404Sa1PgryqRX8RtyDCGAwQvbCQdW2fchoU3+HaIa+gmcROKF yfA5dk+IhpAkuwk7nsyHmHuB1pWzwSG3a5iJzevI8en0zx0YFdhTZKT4HBIspaWFbZ+EzWZGDz8m U9N1G8G/dGy4Be1HEORtZRD4SfSFDcHR6hGfJZqptc2JMQV/kWWFRMZBgQjWMseQuuy1Wc4oRuhH UdbGQrgN9UEElUjZG+lJCP/ex02wjzo4Dk55WTetfg8+wXeEcxTCjHhFomSzhQ6kmextpodQFceJ MEEOSuRsmMjajbac654XZ4zmyxFU7++9pn93AyR2r4j5jd8IngTcOoU8wJkE3hpRCct5qBHREfGV PbEjqh7ZjTDQSViHCBpxA9tl17Q/3+idYxCHpdzILpwGkDVKNlpil4i1oUcXhoSf4oFIMf2OeF70 t1vE2YbPoBjoP6xAjmkUzgecZEg3YE3TYipw9lb8eT9744dUaT3xN5UwcXwjGq5XmyQIYNgYAHG5 kxxioOhaCJkTSRGNJDNLWCvrQEpyb0QTuHY5zPktmDemHrxB/qdCKWQG05grIxXQHTdIiDGACauO zIdB4uDHMJ0NnQlvjiFHHB5Yy8XCBufPgH89LG74ezJCtEZaOteIMdDRoHjX909JjSfi6Z6wkiMA GRdh6bQfW5StcRd+jpJN5mSqmWj08myCQy/nef1PK3wmvbw6OFFJYvNhNtkrjg/Q3YwjEhwm6mGj WAmakBb3V/ssdsD2MAVsbJBWI7Gjyp1dghI9hyOc2uMPnxMtzXWQtfFlOrMXLPuu9L8de80ybd58 5AAAAAZiS0dEAP8A/wD/oL2nkwAAAAlwSFlzAAAuIwAALiMBeKU/dgAAAAd0SU1FB+ILGBUYM1ID xpwAAAAZdEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVBXgQ4XAAAFmklEQVR42u2dP2gTbxjH v4HfckKFLvUPQUQkkaISh0qx9LQqQlHi4BVcxE0igkPcVByECkLpIBQlgyBZBNOlKAVpFSOV4g0V K6WVDiKH1SmQDB3zG96+adImbd673OUu9/1MSdpLGq7f5/k+z3v3vJFyuVwGISqYZu3zxUWgUKh9 bXUVWFqqe7iVzyPq1t+maUBfX+1rPT1Af//m8+5u4MQJ8XjvXiAeD+VpjFD8IWdtDbAs8Tif33x9 asobsfqJWAzYv38zWMgg0aEBguIPS5aWwpairhY6UXMVg4PAkSMiMBw7BnR1UfykTaysiOz97VvF bnudrS0AUV1vbLUlhw8Dhw7Z+5BiUXzHRlS5lQoeBLnKdx8cBE6dAo4fD4RToPiDZtGXloQA5ueB 79+Bnz+9scK9vcDRo+I1KfKg2eFSCVhe3h4YCgXg8+fWBwtdB5JJIJEATp/2nUOg+P2czX/8ABYW xD+mWxlMCjmZrH2+tWkW5nJJBgfTBNbXnQXSkRFgaMgXwYDi91NG//ix5UKvWFKZuRMJkbHDLm6n geH3b+DXL2Bqyn6JJYPB1attOR8Ufzutu5N/nEb2PJncrKspcG9Liq9fK+dVNYBbAKKGAVy/Dly6 5IkroPi9qDHzeVGjv3vnzDZKkZ88KZppiQQQjYZ2nToQpdvbt7aCAXQduHkTGB4GDhyg+ANxsufm hC388MFRM65i15nJOycRvH8PvH4N5HLqAf/Jk5Y7AorfD3V6LAacPy9qcl0P9NoxcTkQGAaQSgEX LlD8nmGarbHvAVwPJi4nkelp4OlTJadoAYg+eADcuWO7LKD4G52QL1/EMtubN7bse41tTyREt92l 2o10UNmYzcIaHVVrAus68OiRshug+GVWX1wUEdhuVpcZfWiIQifOmZwEnj1TKyc1Dchmm+4NhE/8 DpdkKjX6yAitO/HGhT5+DLx4oeY6x8aAW7d2DAKdL36nFl7TxJJLX5+4kYMdd9KukiCZVO8LzMw0 LAc6T/zystiZGeDVKyULX1Ons+tO/MjDh8DoqNoxqRTw/HkHil+urU9Pw8rl1Bol1fb9zBnW6SQ4 /QDDcBwAgid+u2LXNODyZXHFFO07CWMAGBsD7t0LkPjlOqiq2Nl9J53O7dtKjUAAotm9kfj8J37Z jc/lmq7ZKzdF9PcL0TOrk7AQj6s1sTUN+PcP6OryifjlDRCZTHNfpLoDPzDApTYSXkxTzAawYf/b J/7Z2eazuxT7xYtszBGylT171C9M+/MH/3lq55u9mYFiJ6R50mn15b+JCZfFX9Ws20nwNYMMKHZC 1OjuVj9mfNwF8csMf//+zvW7YYhlt4EBRFmzE2KfelOLd2N9vUU1fzOWvs3zygjpWCIRW4c5y/yy aVdnrdECEE2lRN3u0UwyQkLH5KT9mKGc+dfWgIkJYHx8e4dRXhd/5QqX3whxm1IJ2LfP9mCZ5jN/ vfuLZVfeMHy5KQEhHU0m42gg7M6ZfyPL10wWicXEfcLM7oS0j7U14OBB+8drWoPMPzsr6vhcjrU7 CY+YisVgJLRSCTh3ztl7ZLNVmV927G/cED9Mp9mZJ+FClrZ//9ZOU45G/XPtiWkCZ8863zZsZQWR crFYRiYjptIOD7u6SQAhgXEB9Zra9bY982rgi41xXvWwAESXl4F4HJFyLlemnSekARsTdeuublXT aMNTJ8FBjqCzM99/F+EDnN5LiFogmJsTN6OpDn7VNFFC9/SIW8+BTfcgke/Zqq3dtn7+wkJNT4Pi J8RJ/Z3P258C7RWGAbx8uc2BUPyEtDoYzM+rz5N0A00DPn1q2LSn+AlxC7e2Y98NXQfu3gWuXdvx 1yh+QrwOCJYlHMLqquPdnGuyfDotluqbvFaB4ifEb0GhUBA7P5tm3aZfZX+J3l5HA2/+B/t25KAI ILQmAAAAAElFTkSuQmCC \"/>\n";

        String andikenomaPath = "m 72.319998,12.772559 c -2.491427,-0.434411 -8.703248,-1.935976 -8.568086,-2.071138 0.06212,-0.06212 1.928246,0.115266 4.146957,0.394185 2.333532,0.293354 4.654534,0.414074 5.506054,0.286381 1.667267,-0.250023 3.123661,-1.31419 3.698781,-2.7026465 C 77.580078,7.5292672 76.98371,6.1622547 75.564846,5.1519354 74.00347,4.0401373 69.491297,2.558459 65.611806,1.8836192 60.722815,1.0331765 51.079538,0.73269696 45.564405,1.2589526 35.778146,2.1927606 17.600849,5.8470333 5.7774994,9.257512 3.9391241,9.7877965 2.3875785,10.174245 2.3296202,10.116287 2.2069886,9.9936554 6.5804786,8.3583277 9.5999998,7.3977594 14.556581,5.8209744 31.965866,1.9533203 37.911276,1.1081137 39.676073,0.85722806 44.165423,0.48754858 47.887612,0.28660377 60.116178,-0.37356387 69.251096,0.77750339 77.102577,3.967905 c 3.015341,1.2252646 4.497421,2.8509024 4.497421,4.9330489 0,2.7878861 -4.567238,4.6933331 -9.28,3.8716051 z";

        return "  <path\n" +
                "     style=\"fill:#FF0000;stroke-width:0.31999999\"\n" +
                "     d=\"" + andikenomaPath + "\"\n" +
                "     id=\"andikenoma\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return ANDIKENOMA_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Andikenoma{}";
    }

}
