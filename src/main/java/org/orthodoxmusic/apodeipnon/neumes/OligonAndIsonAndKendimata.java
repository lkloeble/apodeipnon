package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class OligonAndIsonAndKendimata extends Neume {

    private static int OLIGON_AND_ISON_AND_KENDIMATA_LENGTH = 85;

    public OligonAndIsonAndKendimata() {
        height = 37;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        return "<image oligon+ison+kendimata x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"85.12\" height=\"36.48\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAQoAAAByCAYAAACrzZ/RAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKDDMmnSnxRQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAA0WSURBVHja7Z0/bBP3+8ff5dcOlhBSDagSMm1VpNAhpQblUFQShaF1 yXSREUMrBMuVKXS7JiJIYcAVagYkDnUgyXAZYLIVlqbHlKh2VdUIW4ih9tB/tlBR62sn33jfgZ+j kL/+c8/5zn6/pM9AiM+f3N3nfc/zuefPa67ruvAA27bxzz//bPn5wMAACCHh5vV2P1gsFvH06VP8 8MMPWFhY2PV3FUXBxMQEhoaGMDQ0hGg0yjNPSIh4rRWLwnEcrKysYGlpCQ8fPmz7SzVNw4ULFzA6 OopIJMKrQEivCMWjR49w/fp15PN5z75cURRMT09jfHycgkFImIXCcRzMzs5ibm5ObBINwUgmk7wi hIRNKKrVKpLJpKdWxF4uyfz8PK8KIWERCr9FokE2m8WZM2d4ZQgJEPuCJBIARF0cQohHFoXjOBgb G+uKSDSwLAuJRIJXh5CgWhSzs7NdFQkAuH79OhzH4dUhJIhCkclkAmH65/N5rKys8OoQEjShsG0b t27dCszEbt26RauCkKAJxf3797vucmy2KhYXF3mFCAkAr7mu69q2jYMHDwZygrVajbkhhATBolhd XQ3sBO/fv8+rREgQLIqJiYmOkrykKZVKTFcnpJsWRbVaFRUJRVFgGAYsy0KpVEKtVoPruqjX6yiV SigUCkin09A0bcdj7JXGTggRtigsy3I//fRTzw+sqip0XW8pHNu2bTx+/BjffvvtFvGiVUFIFy2K x48fe37QdDqN5eXllnM2otEoEokElpeXkc1moSgKrQpCgiAUv/32m6duRqlU8iRd/MyZM1hbW4Np mgBe5oDkcjleMUK64XoAcL0SiUwmg1gs5vkki8Uirly5giNHjmB5eZlXjRC/LQqvDnTv3j0RkQCA eDyOTCaD58+f06ogJKxCYRgG4vG46ERjsdh6LgpDuwkJoevhZ/RktVrFzz//zLJ5hPjI650eIJVK +RpiHYvFtu0fQggJsOsxNjbm+6Sl3RxCyCahSKVSHR3g1KlTPIuE9LpQdGIRKIrCfhyE9INQnDp1 6pUIyFY4e/YszyAh/SAUkUgE09PTPBOEkJ2FAgDGx8fbtioIIX0iFJFIBDdv3uTZIITsLBQAkEgk oOt6Sx8ul8s8g0SEcrm8PsKG4zjI5XIol8uwbbsnrscrDYBs28a5c+daKrLbZDN0QlpebIuLi7h6 9SqAl2/Yzp49i7fffhtHjhzB4OAgDh06FNh6qo1ExsZa0jQNb775JoaHh/HWW2/h8OHDoaqvsqVT WLFYxMmTJ5s+AAvKEEkePXqEvQor6bqOwcFBHDt2DO+8845YcmKrNNOaU1VVnD59Gu+//z4GBwcD u5a2bVKcyWRw/vz5pg5gmiYuXbrEO5qIkcvlMDIy0vTvN6yP4eHhri++dvr4apqG0dFRnDhxAseP Hw9GrJK7A4ZhuHiZMLbrUFXVJUQa0zSbuh+3G4qiuKlUyrUsy63Var7PvVKpuIqitD1/TdNc0zTd UqnUtfOP3f5T07Sm/pBu/gGkf9B1ve3Ftnnh+S0ahULBk7kriuIahuEWCoXgCEW9Xm9KLAzD4F1M xKnX6x09mXcSjWw269brdfH5p1IpT+euKIprmqZbqVS6KxStiAWtCuIHlmV5utg2LjrpBSchdI1h mmZ3haJZsdA0jXcx8QVVVUMrFul0WmTu0pY9WlHDvcSCLgjxg2w2K7bYFEUR37uQEjoAbjqdFpnz tq9HdwuCmZ2dxdzc3I6/k81mW+7nQcKDbdvbVhh79uwZgJd5Q368zpNsg6lpGubn58Xm3kr4QTtI xDa1JBQN7t69ux4xx9iKcC7ojTx//hx//vnnlp/v9kDYLfjpm2++CVxsRauk02mxuqyO42BsbKyl 2IpWUFXV87YWbQlFM6qo6zqmp6cDG2Lb7wtaEr8eFKdPnxZbbIBs0ei9HrZBE7q2hQLYGs++HYZh 4PPPPw+9YPTigpbEDxd0aWkJly9fFju+YRiYnJwUOXa1WsXRo0fF5q4oCtbW1jxzAzsSisYCmpqa 2rM3qK7r+PjjjzE0NCQqGtVqFfV6/ZWf1et1/Prrr1t+95dffsF///33ys/+/fdf9jn16EaV6hzn 12KTtiq++OIL0XvNsiwkEolgCEU7GzSbMwEBYP/+/Xj33Xd3Xdg//fTTK/8ul8tiG1rEG1/5wYMH opubkpua0lZFMwlvgdmr8PIVSqVSaTrsm6M/hq7roY1LwP+/LpWK2qzVauLn36tQb0hdPKkINI7w DcmowUqlIj7/bDYrNn/pB6tXsU2QOgG1Wq3pDFSO3h+Si00ygAnCUcdSIekbhxcWEVxhKBgcEA6P 7iQF3c/FFmaLaB+EiUajmJycRK1Wg2EY3OHrU/L5PCYnJ0U60Z84cUJ8/k+ePBE5biwWg6qqonNf W1sL1mZmsxZGOp0WNxc5+mtzU3pPLJVKia0JaYtIUZTgux67USgUPM/R5wj+kEhc8sO9DfOGbKdv P7oqFBszU7PZLEWjj4bXFZokM0ql5uynRdTp249ACMVm0SgUCq5hGHRPuLnZ0n0T5te80hZRp7Vt AycU2+1pZLNZCkcPDk3TPH2b4FVNTanFtpcbLn2+OxHmwAvFdk+OUqnkptNp1zAM8ZuDA6HZJPQj JkHqFa8fFpFlWf4UrgkyjuOgUqm8kieyUxYnkWF1dbWttG+vUqJt28bBgwdF/0YvE6028/XXX2Nm ZkZs7p3UCukZoSDBopGW//vvv+Ovv/7Cs2fPdk2zLxQKiMfjHX+vdEamZGEe6SQx4GXCZTtJehQK 4ivFYhFPnz5FJpN5JevTq7R06RoVnSy2IFhEbQsyS7WSoMTReLG56UdGpmTeivSeW7uvSffxGUe6 RTwex7Vr19bD+xcWFnD79u2OjhmNRqFpmui8PQmJ3gHpcO6lpSXuUZBwUy6XMTc3h/Hx8Y42N/3w 9aWWjXTh3XbdD1oUJDAMDAysl8kvl8ttH2d0dBSKoojONZfLiRw3EomIFyb+7rvvWv4MhYIEjmQy 2VEtTD8Wm2T5vYmJCdG5z8zMwLbtlj7zfzdu3LjBW5MEjTfeeKOjz3/wwQd48eKFWHr4jz/+iI8+ +gjHjh3z/NgHDhzAoUOHsLKyIuo6ffLJJy19wFf86LxMSCPaUbLUnHSvUulI01ayeH0XikKhIPp6 iZDNYiGZcKWqqlj1q8Z6kcwsbXYtdiWOwjAMWhbE9weU1ILzOrltu9gQyfiKZsSiK0JRr9fFlZiQ 7e47qQrx0m5IQ+ykMqj3ShjrWmRmoVAQrW5MyF6C4fWiUxSlowzNZslmsyIWRiqV2vHh3dUQ7lQq 5VnfAULafWB5vYeh67pbq9XE516r1VzTND0VPEVRtnVFuioU9XrdNxUmpBnRME3TszclqVRKtHze RiqVimtZlmeWhqqqrmVZ64LX9RDuRrhtqVTCwMAAAwhIIGjUN9mYJt9ur1tVVaHrunh3941Uq1X8 8ccfePHixXrP3t3S/HfDNM1g5Hp89dVXWF1dFe9+TYiXC7Fer+/5e0F8+DVqhezF0aNH19PpAyEU tm3j3Llz+PDDD3Hnzh3R7teEkNZ5PQiTiEajuHnz5nrGH8WCkGARmKSwRCIBXdexsLCAxcVFXhlC AkSg6lE0XJB8Pg9d16FpGjc4CaFQbGVz0RFd1zE8PMwrRXqW9957z5PCwqIE8X22ZMYfBwd6vGua BIEshVetVjsqXEJI2FBVFQ8ePAjsJn4gK1zFYjGk02nePaRvePjwIWZnZ+l60AXh4JDvOt5Xrgdd ENLPZLNZX8O9Q+t60AUh/czIyAiq1SqFohWSyaR4QxdCgnjfO45DoWgFXdd555C+Ip/P48svvwyM WIRCKAYGBmCaJu8e0lcEKZ0hNC0FHcfBZ599Jtp4hZAgYlkWEokEhaJZyuUyjh8/zjuH9B3dLuwU qpaCdEFIv3Lx4sWW2wD2rVAAwIULF8RbwxMSNPL5PKamprq2uRkq14MuCOl3UqkUrl27RouiWRfE MAzeNaTvmJmZQSaToUXRLI7jYGxsDPl8nncP6TsKhYKvNSz2hfVERSIR3Lt3j3cM6UuuXLnia5j3 vjCfrHg8jlQqxbuG9B35fB6Tk5P+bW72Qh9JybbwHBxBHrquM828WYrFIk6ePMnHDOlLTNPEpUuX 6HrQBSFkZy5fvoxcLif6HT1hURDSSzT6nm7k77//Xu8julMP0UqlItaSk0JBSAiF5MmTJ5ibm3sl SVJRFKytrYkU6KVQEBJiMpkMzp8/v/5vTdMwPz/v+ffs46kmJLwkk0lUKpX1KnALCwu4e/cuLQpC yPbuyOLiIq5evQrA+wK9FApCeohcLoeRkREA3tawoFAQ0mOUy2VcvHgRAPD9998jGo1SKAghW7Ft G1NTUwCAO3fudPwmhEJBSI/iOA5u376NAwcOYHJykkJBCNmZpaUl7N+/H8lkkkJBCNmZXC6Hw4cP t725+T+UAAkfL5uaGQAAAABJRU5ErkJggg== \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 30;
    }

    @Override
    public int getHeightCorrection() {
        return 10;
    }

    @Override
    public int getLength() {
        return OLIGON_AND_ISON_AND_KENDIMATA_LENGTH;
    }

    @Override
    public String toString() {
        return "OligonAndApostrophosAndKendimata{}";
    }



}
