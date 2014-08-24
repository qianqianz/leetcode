public class Solution {
    public String intToRoman(int num) {
        String result = "";
        while(num > 999) {
            result += "M";
            num -= 1000;
        }
        if(num > 899) {
            result += "CM";
            num -= 900;
        }
        if(num > 499) {
            result += "D";
            num -= 500;
        }
        if(num > 399) {
            result += "CD";
            num -= 400;
        }
        while(num > 99) {
            result += "C";
            num -= 100;
        }
        if(num > 89) {
            result += "XC";
            num -= 90;
        }
        if(num > 49) {
            result += "L";
            num -= 50;
        }
        if(num > 39) {
            result += "XL";
            num -= 40;
        }
        while(num > 9) {
            result += "X";
            num -= 10;
        }
        if(num == 9) {
            result += "IX";
            num -= 9;
        }
        if(num > 4) {
            result += "V";
            num -= 5;
        }
        if(num == 4) {
            result += "IV";
            num -= 4;
        }
        while(num > 0) {
            result += "I";
            num -= 1;
        }
        return result;
    }
}