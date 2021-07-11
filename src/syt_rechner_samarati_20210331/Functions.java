package syt_rechner_samarati_20210331;

public class Functions {
    
    public static final int ROUND_PLACES = 4;
    
    //URI
    public static double getUwithRI(double r, double i){
        return r*i;
    }
    
    public static double getIwithUR(double u, double r){
        return u/r;
    }
    
    public static double getRwithUI(double u, double i){
        return u/i;
    }
    
    //RG
    public static double getRwithG(double g){
        return 1/g;
    }
    
    public static double getGwithR(double r){
        return 1/r;
    }
    
    //Scheitelwert
    public static double getEffectivewithVertex(double v){
        return v/Math.sqrt(2);
    }
    
    public static double getVertexwithEffective(double e){
        return e*Math.sqrt(2);
    }
    
    //Ind. Blindwiderstand XL
    public static double getXLwithFL(double f, double l){
        return getCircle()*f*l;
    }
    
    public static double getFwithXLL(double xl, double l){
        return xl/(getCircle()*l);
    }
    
    public static double getLwithXLF(double xl, double f){
        return xl/(getCircle()*f);
    }
    
    //Kap.Blindwiderstand XC
    public static double getXCwithFC(double f, double c){
        return -1/(getCircle()*f*c);
    }
    
    public static double getFwithXCC(double xc, double c){
        return -1/(xc*getCircle()*c);
    }
    
    public static double getCwithXCF(double xc, double f){
        return -1/(xc*getCircle()*f);
    }
    
    //Ind. Blindleitwert BL
    public static double getBLwithFL(double f, double l){
        return -1/(getCircle()*f*l);
    }
    
    public static double getFwithBLL(double bl, double l){
        return -1/(bl*getCircle()*l);
    }
    
    public static double getLwithBLF(double bl, double f){
        return -1/(bl*getCircle()*f);
    }
    
    //Kap.Blindleitwert BC
    public static double getBCwithFC(double f, double c){
        return getCircle()*f*c;
    }
    
    public static double getFwithBCC(double bc, double c){
        return bc/(getCircle()*c);
    }
    
    public static double getCwithBCF(double bc, double f){
        return bc/(getCircle()*f);
    }
    
    //XB
    public static double getXwithB(double b){
        return -1/b;
    }
    
    public static double getBwithX(double x){
        return -1/x;
    }
    
    //Kom. Z. Addition
    public static double getAddtionRPwithRP1RP2(double realpart1, double realpart2){
        return realpart1+realpart2;
    }
    
    public static double getAddtionIPwithIP1IP2(double imaginarypart1, double imaginarypart2){
        return imaginarypart1+imaginarypart2;
    }
    
    //Kom. Z. Subtraktion
    public static double getSubtractionRPwithRP1RP2(double realpart1, double realpart2){
        return realpart1-realpart2;
    }
    
    public static double getSubtractionIPwithIP1IP2(double imaginarypart1, double imaginarypart2){
        return imaginarypart1-imaginarypart2;
    }
    
    //Kom. Z. Multiplikation
    public static double getMultiplicationPointerwithP1P2(double pointer1, double pointer2){
        return pointer1*pointer2;
    }
    
    public static double getMultiplicationAnglewithA1A2(double angle1, double angle2){
        return angle1+angle2;
    }
    
    //Kom. Z. Division
    public static double getDivisionPointerwithP1P2(double pointer1, double pointer2){
        return pointer1/pointer2;
    }
    
    public static double getDivisionAnglewithA1A2(double angle1, double angle2){
        return angle1-angle2;
    }
    
    //K.F. - P.F.
    public static double getPointerwithRPIP(double realpart, double imiginarypart){
        return Math.sqrt(realpart*realpart+imiginarypart*imiginarypart);
    }
    
    public static double getAnglewithRPIP(double realpart, double imiginarypart){
        return Math.atan(imiginarypart/realpart);
    }
    
    public static double getRealpartwithPA(double pointer, double angle){
        return pointer*Math.cos(angle);
    }
    
    public static double getImaginarypartwithPA(double pointer, double angle){
        return pointer*Math.sin(angle);
    }
    
    //Impedanz Z
    public static double getImpedanzPointerwithIPUP(double ipointer, double upointer){
        return getDivisionPointerwithP1P2(upointer, ipointer);
    }
    
    public static double getImpedanzAnglewithIAUA(double iangle, double uangle){
        return getDivisionAnglewithA1A2(uangle, iangle);
    }
    
    public static double getVoltagePointerwithZPIP(double zpointer, double ipointer){
        return getMultiplicationPointerwithP1P2(zpointer, ipointer);
    }
    
    public static double getVoltageAnglewithZAIA(double zangle, double iangle){
        return getMultiplicationAnglewithA1A2(zangle, iangle);
    }
    
    public static double getCurrentPointerwithZPUP(double zpointer, double upointer){
        return getDivisionPointerwithP1P2(upointer, zpointer);
    }
    
    public static double getCurrentAnglewithZAUA(double zangle, double uangle){
        return getDivisionAnglewithA1A2(uangle, zangle);
    }
    
    //Admittanz Y
    public static double getAdmittanzPointerwithUPIP(double upointer, double ipointer){
        return getDivisionPointerwithP1P2(ipointer, upointer);
    }
    
    public static double getAdmittanzAnglewithUAIA(double uangle, double iangle){
        return getDivisionAnglewithA1A2(iangle, uangle);
    }
    
    public static double getCurrentPointerwithYPUP(double ypointer, double upointer){
        return getMultiplicationPointerwithP1P2(ypointer, upointer);
    }
    
    public static double getCurrentAnglewithYAUA(double yangle, double uangle){
        return getMultiplicationAnglewithA1A2(yangle, uangle);
    }
    
    public static double getVoltagePointerwithYPIP(double ypointer, double ipointer){
        return getDivisionPointerwithP1P2(ipointer, ypointer);
    }
    
    public static double getVoltageAnglewithYAIA(double yangle, double iangle){
        return getDivisionAnglewithA1A2(iangle, yangle);
    }
    
    //ZY
    public static double getZwithY(double y){
        return 1/y;
    }
    
    public static double getYwithZ(double z){
        return 1/z;
    }
    
    public static double getZAnglewithYAngle(double yangle){
        return -yangle;
    }
    
    public static double getYAnglewithZAngle(double zangle){
        return -zangle;
    }
    
    private static double getCircle(){
        return 2*Math.PI;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    //Scheinleistung
    public static double getApparentpowerwithUI(double u, double i){
        return u*i;
    }
    
    public static double getVoltagewithAPI(double apparentpower, double i){
        return apparentpower/i;
    }
    
    public static double getCurrentwithAPU(double apparentpower, double u){
        return apparentpower/u;
    }
    
    //Wirkleistung
    public static double getActivepowerwithUIC(double u, double i, double cosinus){
        return u*i*cosinus;
    }
    
    public static double getVoltagewithACIC(double activepower, double i, double cosinus){
        return activepower/(i*cosinus);
    }
    
    public static double getCurrentwithACUC(double activepower, double u, double cosinus){
        return activepower/(u*cosinus);
    }
    
    public static double getCosinuswithACUI(double activepower, double u, double i){
        return activepower/(u*i);
    }
    
    //Blindleistung
    public static double getBlindpowerwithUIS(double u, double i, double sinus){
        return u*i*sinus;
    }
    
    public static double getVoltagewithBIC(double blindpower, double i, double sinus){
        return blindpower/(i*sinus);
    }
    
    public static double getCurrentwithBUS(double blindpower, double u, double sinus){
        return blindpower/(u*sinus);
    }
    
    public static double getSinuswithBUI(double blindpower, double u, double i){
        return blindpower/(u*i);
    }

    //Leistungsfaktor
    public static double getPowerfactorwithACAP(double activepower, double apparentpower){
        return activepower/apparentpower;
    }
    
    public static double getActivepowerwithPFAP(double powerfactor, double apparentpower){
        return powerfactor*apparentpower;
    }
    
    public static double getApparentpowerwithPFAC(double powerfactor, double activepower){
        return activepower/powerfactor;
    }
    
    
    
    
    
}
