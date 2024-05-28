import java.lang.reflect.Array;
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        
    }
    //Strings

    //Question 1
    public static String uppOrLower(String str) {
        int uCount = 0;
        int lCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char charNow = str.charAt(i);
            if (Character.isUpperCase(charNow)) {
                uCount++;
            } else {
                lCount++;
            }
        }
        if (lCount >= uCount) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }
    }

    //Question 2
    public static String stringType(String str) {
        boolean num = false;
        boolean word = false;

        for (int i = 0; i < str.length(); i++) {
            char charNow = str.charAt(i);
            if ((int) charNow >= 48 && (int) charNow <= 57) {
                num = true;
            } else {
                word = true;
            }
        }
        if (num && word) {
            return "MIXED";
        } else {
            if (num) {
                return "NUMBERS";
            } else {
                return "WORDS";
            }
        }
    }

    //Question 3
    public static void subStringed(String str) {
        int flag = -1;
        for (int i = 0; i < str.length(); i++) {
            char charNow = str.charAt(i);
            if (Character.isUpperCase(charNow)) {
                flag *= -1;
                System.out.println();
                continue;
            }
            if (flag == 1) {
                System.out.print(charNow);
            }
        }
    }

    //Question 4
    public static String commonWords(String str1, String str2) {
        String str = "";
        for (int i = 0; i < str1.length(); i++) {
            char charNow = str1.charAt(i);
            if (str2.indexOf(charNow) != -1) {
                str += charNow;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char charNow = str2.charAt(i);
            if (str1.indexOf(charNow) != -1) {
                str += charNow;
            }
        }

        if (str.isEmpty()) {
            return "Nothing in common";
        } else {
            return str;
        }
    }

    //Question 5
    public static String usisPass(String pass) {
        boolean lowerCase = true;
        boolean upperCase = true;
        boolean specialChar = true;
        boolean digit = true;

        String output = "";

        for (int i = 0; i < pass.length(); i++) {
            char charNow = pass.charAt(i);
            if ((int) charNow >= 97 && (int) charNow <= 122) {
                lowerCase = false;
            } else if ((int) charNow >= 65 && (int) charNow <= 90) {
                upperCase = false;
            } else if ((int) charNow >= 48 && (int) charNow <= 57) {
                digit = false;
            } else {
                specialChar = false;
            }
        }
        if (lowerCase) {
            if (output == "") {
                output += "LowerCase missing";
            } else {
                output += ", LowerCase missing";
            }
        }
        if (upperCase) {
            if (output == "") {
                output += "UpperCase missing";
            } else {
                output += ", UpperCase missing";
            }
        }
        if (specialChar) {
            if (output == "") {
                output += "Special Characters missing";
            } else {
                output += ", Special Characters missing";
            }
        }
        if (digit) {
            if (output == "") {
                output += "Numbers missing";
            } else {
                output += ", Numbers missing";
            }
        }
        if (!digit && !specialChar && !upperCase && !lowerCase) {
            output += "Okay";
        }
        return output;

    }
    //ArrayLists

    //Question 1
    public static void arrFreq() {
        ArrayList<String> elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            String num = sc.next();
            if (num.equals("STOP")) {
                break;
            } else {
                elements.add(num);
            }
        }
        while (!elements.isEmpty()) {
            int count = 0;
            String elNow=elements.getFirst();
            for (int i = 0; i < elements.size(); i++) {
                if (Objects.equals(elNow, elements.get(i))) {
                    count++;
                }
            }
            System.out.println(elements.getFirst() + "- " + count + " times");
            while (elements.contains(elNow)) {
                elements.remove(elNow);
            }
        }
    }

    //Question 2
    public static void highestSum(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lists you want: ");
        int rowsNum=sc.nextInt();
        System.out.print("Enter the number of elements in each list: ");
        int colsNum=sc.nextInt();
        ArrayList<ArrayList<Integer>>objects=new ArrayList<>();
        for(int i=0;i<rowsNum;i++){
            ArrayList<Integer>row=new ArrayList<>();
            System.out.printf("Enter %d integers for row %d: ",colsNum,i+1);
            for(int j=0;j<colsNum;j++){
                row.add(sc.nextInt());
            }
            objects.add(row);
        }
        System.out.println(objects);
        int maxValue=0;
        ArrayList<Integer> maxList= new ArrayList<>();
        for(int i=0;i<rowsNum;i++){
            int count=0;
            for(int j=0;j<colsNum;j++){
                count+=objects.get(i).get(j);
            }
            if(count>maxValue){
                maxValue=count;
                maxList=objects.get(i);
            }
        }
        System.out.printf("The list containing the highest elements: %d ",maxValue);
        System.out.println(maxList);
    }

    //Question 3

    public static void ubJumper(){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many elements? : ");
        int elNum=sc.nextInt();
        ArrayList<Integer>elements=new ArrayList<>();
        for(int i=0;i<elNum;i++){
            System.out.printf("Input element no.%d :",i);
            elements.add(sc.nextInt());
        }
        int[] ubNum= new int[elNum];
        for(int i=1;i<elNum;i++){
            ubNum[i-1] = elements.get(i)-elements.get(i-1);
        }
        for(int i=0;i<ubNum.length;i++){
            int minPos=i;
            for(int j=1+i;j<ubNum.length;j++) {
                if (ubNum[j]<ubNum[minPos]) {
                    minPos=j;
                }
            }
            int temp=ubNum[i];
            ubNum[i]=ubNum[minPos];
            ubNum[minPos]=temp;

        }
        boolean uB=true;
        for(int i=0;i<ubNum.length;i++){
            if (i != ubNum[i]) {
                uB = false;
                break;
            }
        }
        if(uB){
            System.out.println("UB Jumper");
        }
        else {
            System.out.println("Not UB Jumper");
        }
    }
    public static void ubJumperBeta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many elements? : ");
        int elNum=sc.nextInt();
        ArrayList<Integer>elements=new ArrayList<>();
        for(int i=0;i<elNum;i++){
            System.out.printf("Input element no.%d :",i);
            elements.add(sc.nextInt());
        }
        boolean ubNum=true;
        for(int i=0;i<elNum-1;i++){
            int diff = elements.get(i+1)-elements.get(i);
            if (diff != i + 1) {
                ubNum = false;
                break;
            }
        }
        if(ubNum){
            System.out.println("UB Jumper");
        }
        else {
            System.out.println("Not UB Jumper");
        }
    }

    //Dictionary/Tuple/HashMap

    //Question 1
    public static void addHash(HashMap<Character,Integer> hash1,HashMap<Character,Integer> hash2){
        for(Character keys:hash1.keySet()){
            if(hash2.containsKey(keys)){
                int num1=hash2.get(keys);
                int num2=hash1.get(keys);
                hash1.replace(keys,num1+num2);
            }
        }
        System.out.println(hash1);
    }

    //Question 2
    public static void hashFreq() {
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Print several numbers and enter \"STOP\" to stop ");
        for (;;) {
            String val = sc.next();
            if (val.equals("STOP")) {
                break;
            } else {
                hash.put(val, hash.getOrDefault(val,0)+1);
            }
        }
        for(String val: hash.keySet()){
            System.out.println(val+": "+hash.get(val));
        }
    }

    //Question 3

    public static void valueCount(){
        Scanner sc=new Scanner(System.in);
        ArrayList <String> k= new ArrayList<>();
        ArrayList <Integer> v= new ArrayList<>();

        for(;;){
            System.out.print("Enter key: ");
            String key=sc.next();
            if(key.equals("STOP")){
                break;
            }else {
                System.out.println("Enter value: ");
                int value=sc.nextInt();
                k.add(key);
                v.add(value);
            }
        }
        HashMap <Integer,ArrayList<String>> map=new HashMap<>();

        while (!(v.isEmpty())) {
            ArrayList<String> keysList =new ArrayList<>();
            int valNow=v.getFirst();
            for(int i=0;i<v.size();i++){
                if(v.get(i)==valNow){
                    keysList.add(k.get(i));
                }
            }
            map.put(valNow,keysList);
            for (String key : keysList) {
                int index = k.indexOf(key);
                k.remove(index);
                v.remove(index);
            }
        }
        System.out.println(map);
    }
    //Question 4
    public static String symbolMap(String word){
        Map<Integer, String> symbolMap = new HashMap<>() {{
            put(1, "*#");
            put(2, "ABC");
            put(3, "DEF");
            put(4, "GHI");
            put(5, "JKL");
            put(6, "MNO");
            put(7, "PQRS");
            put(8, "TUV");
            put(9, "WXYZ");
            put(0, " ");
        }};
        String out="";
        for(int i=0;i<word.length();i++){
            char charNow=word.charAt(i);
            for(int j=0;j<10;j++){
                if(symbolMap.containsKey(j) && symbolMap.get(j).contains(String.valueOf(charNow))){
                    out+=j;
                    break;
                }
            }
        }
        return out;
    }

    //Function

    //Question 1
    public static String amiKenoMota(double cm, double kg){
        double m=cm/100.0;
        double bmi=kg/Math.pow(m,2);
        String formattedBmi = String.format("%.1f", bmi);
        if(bmi<18.5){
            return "Score is "+formattedBmi+". You are Underweight";
        }
        if(bmi<24.9){
            return "Score is "+formattedBmi+". You are Normal";
        }
        if(bmi<30.0){
            return "Score is "+formattedBmi+". You are Overweight";
        }
        else {
            return "Score is "+formattedBmi+". You are Obese";
        }
    }

    //Question 2
    public static int numAdd(int min,int max,int div){
        int out=0;
        for(int i=min;i<max;i++){
            if(i%div==0){
                out+=i;
            }
        }
        return out;
    }

    //Question 3
    public static void foodPanda(String food,String location){
        HashMap<String,Double> menu= new HashMap<>(){{
            put("BBQ Chicken Cheese Burger",220.0);
            put("Beef Burger",170.0);
            put("Naga Drums",200.0);
        }};

        try{
            double deliveryCharge=60.0;
            double foodBill=menu.get(food);
            if(location.equals("Mohakhali")){
                deliveryCharge=40.0;
            }
            double totalBill=foodBill*1.08 + deliveryCharge;
            String formattedBill=String.format("%.1f",totalBill);
            System.out.println( formattedBill);

        }
        catch (Exception e){
            System.out.println("Invalid food name");
        }
    }

    //Question 4

    public static String replace_domain(String email){
        String out="";
        String domain="";
        boolean outAdd=true;
        for(int i=0;i<email.length();i++){
            if(outAdd){
                out+=email.charAt(i);
            }
            else {
                domain+=email.charAt(i);
            }
            if(email.charAt(i)=='@'){
                outAdd=false;
            }
        }
        if(!(domain.equals("sheba.xyz"))){
            out+="sheba.xyz";
        }
        return out;

    }

    //Question 5

    public static boolean isPalindrome(String str){
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        if(revStr.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    //Question 6

    public static String capitalize(String str){
        String out="";
        out+=Character.toUpperCase(str.charAt(0));
        boolean cap=false;
        for(int i=1;i<str.length();i++){
            char charNow=str.charAt(i);
            if(charNow=='.'||charNow=='?'||charNow=='!'){
                cap=true;
                out+=charNow;
            }
            else {
                if(cap && charNow!=' '){
                    out+=Character.toUpperCase(charNow);
                    cap=false;
                }
                else {
                    out+=charNow;
                }
            }
        }
        return out;
    }
}





