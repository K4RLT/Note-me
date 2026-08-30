package w7;
import g5.q;
import r0.e1;
import r0.r;
import x.m;
import x.n;
import xa.s2;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i1 {
    public static String a(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static String c(String str, int i, int i10, String str2) {
        return str + i + str2 + i10;
    }

    public static String d(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static HashMap e(Class cls, wa.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap f(Class cls, ya.r rVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, rVar);
        return hashMap;
    }

    public static e1 g(float f10, r rVar) {
        e1 e1Var = new e1(f10);
        rVar.k0(e1Var);
        return e1Var;
    }

    public static wa.a h(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new wa.a(i);
    }

    public static ya.r i(HashMap hashMap, int i) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new ya.r(i);
    }

    public static /* synthetic */ void j(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                q.m();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z3 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z3) {
                    executorService.shutdownNow();
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static void k(String str, String str2, String str3, String str4, String str5) {
        s2.a(str);
        s2.a(str2);
        s2.a(str3);
        s2.a(str4);
        s2.a(str5);
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int m(String str) {
        if (str == null) {
            q.h("Name is null");
            return 0;
        }
        if (str.equals("Adlm")) {
            return 1;
        }
        if (str.equals("Afak")) {
            return 2;
        }
        if (str.equals("Aghb")) {
            return 3;
        }
        if (str.equals("Ahom")) {
            return 4;
        }
        if (str.equals("Arab")) {
            return 5;
        }
        if (str.equals("Aran")) {
            return 6;
        }
        if (str.equals("Armi")) {
            return 7;
        }
        if (str.equals("Armn")) {
            return 8;
        }
        if (str.equals("Avst")) {
            return 9;
        }
        if (str.equals("Bali")) {
            return 10;
        }
        if (str.equals("Bamu")) {
            return 11;
        }
        if (str.equals("Bass")) {
            return 12;
        }
        if (str.equals("Batk")) {
            return 13;
        }
        if (str.equals("Beng")) {
            return 14;
        }
        if (str.equals("Bhks")) {
            return 15;
        }
        if (str.equals("Blis")) {
            return 16;
        }
        if (str.equals("Bopo")) {
            return 17;
        }
        if (str.equals("Brah")) {
            return 18;
        }
        if (str.equals("Brai")) {
            return 19;
        }
        if (str.equals("Bugi")) {
            return 20;
        }
        if (str.equals("Buhd")) {
            return 21;
        }
        if (str.equals("Cakm")) {
            return 22;
        }
        if (str.equals("Cans")) {
            return 23;
        }
        if (str.equals("Cari")) {
            return 24;
        }
        if (str.equals("Cham")) {
            return 25;
        }
        if (str.equals("Cher")) {
            return 26;
        }
        if (str.equals("Chrs")) {
            return 27;
        }
        if (str.equals("Cirt")) {
            return 28;
        }
        if (str.equals("Copt")) {
            return 29;
        }
        if (str.equals("Cpmn")) {
            return 30;
        }
        if (str.equals("Cprt")) {
            return 31;
        }
        if (str.equals("Cyrl")) {
            return 32;
        }
        if (str.equals("Cyrs")) {
            return 33;
        }
        if (str.equals("Deva")) {
            return 34;
        }
        if (str.equals("Diak")) {
            return 35;
        }
        if (str.equals("Dogr")) {
            return 36;
        }
        if (str.equals("Dsrt")) {
            return 37;
        }
        if (str.equals("Dupl")) {
            return 38;
        }
        if (str.equals("Egyd")) {
            return 39;
        }
        if (str.equals("Egyh")) {
            return 40;
        }
        if (str.equals("Egyp")) {
            return 41;
        }
        if (str.equals("Elba")) {
            return 42;
        }
        if (str.equals("Elym")) {
            return 43;
        }
        if (str.equals("Ethi")) {
            return 44;
        }
        if (str.equals("Gara")) {
            return 45;
        }
        if (str.equals("Geok")) {
            return 46;
        }
        if (str.equals("Geor")) {
            return 47;
        }
        if (str.equals("Glag")) {
            return 48;
        }
        if (str.equals("Gong")) {
            return 49;
        }
        if (str.equals("Gonm")) {
            return 50;
        }
        if (str.equals("Goth")) {
            return 51;
        }
        if (str.equals("Gran")) {
            return 52;
        }
        if (str.equals("Grek")) {
            return 53;
        }
        if (str.equals("Gujr")) {
            return 54;
        }
        if (str.equals("Gukh")) {
            return 55;
        }
        if (str.equals("Guru")) {
            return 56;
        }
        if (str.equals("Hanb")) {
            return 57;
        }
        if (str.equals("Hang")) {
            return 58;
        }
        if (str.equals("Hani")) {
            return 59;
        }
        if (str.equals("Hano")) {
            return 60;
        }
        if (str.equals("Hans")) {
            return 61;
        }
        if (str.equals("Hant")) {
            return 62;
        }
        if (str.equals("Hatr")) {
            return 63;
        }
        if (str.equals("Hebr")) {
            return 64;
        }
        if (str.equals("Hira")) {
            return 65;
        }
        if (str.equals("Hluw")) {
            return 66;
        }
        if (str.equals("Hmng")) {
            return 67;
        }
        if (str.equals("Hmnp")) {
            return 68;
        }
        if (str.equals("Hrkt")) {
            return 69;
        }
        if (str.equals("Hung")) {
            return 70;
        }
        if (str.equals("Inds")) {
            return 71;
        }
        if (str.equals("Ital")) {
            return 72;
        }
        if (str.equals("Jamo")) {
            return 73;
        }
        if (str.equals("Java")) {
            return 74;
        }
        if (str.equals("Jpan")) {
            return 75;
        }
        if (str.equals("Jurc")) {
            return 76;
        }
        if (str.equals("Kali")) {
            return 77;
        }
        if (str.equals("Kana")) {
            return 78;
        }
        if (str.equals("Kawi")) {
            return 79;
        }
        if (str.equals("Khar")) {
            return 80;
        }
        if (str.equals("Khmr")) {
            return 81;
        }
        if (str.equals("Khoj")) {
            return 82;
        }
        if (str.equals("Kits")) {
            return 83;
        }
        if (str.equals("Knda")) {
            return 84;
        }
        if (str.equals("Kore")) {
            return 85;
        }
        if (str.equals("Kpel")) {
            return 86;
        }
        if (str.equals("Krai")) {
            return 87;
        }
        if (str.equals("Kthi")) {
            return 88;
        }
        if (str.equals("Lana")) {
            return 89;
        }
        if (str.equals("Laoo")) {
            return 90;
        }
        if (str.equals("Latf")) {
            return 91;
        }
        if (str.equals("Latg")) {
            return 92;
        }
        if (str.equals("Latn")) {
            return 93;
        }
        if (str.equals("Lepc")) {
            return 94;
        }
        if (str.equals("Limb")) {
            return 95;
        }
        if (str.equals("Lina")) {
            return 96;
        }
        if (str.equals("Linb")) {
            return 97;
        }
        if (str.equals("Lisu")) {
            return 98;
        }
        if (str.equals("Loma")) {
            return 99;
        }
        if (str.equals("Lyci")) {
            return 100;
        }
        if (str.equals("Lydi")) {
            return FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
        }
        if (str.equals("Mahj")) {
            return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
        }
        if (str.equals("Maka")) {
            return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
        }
        if (str.equals("Mand")) {
            return FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
        }
        if (str.equals("Mani")) {
            return FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
        }
        if (str.equals("Marc")) {
            return FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
        }
        if (str.equals("Maya")) {
            return FacebookMediationAdapter.ERROR_NULL_CONTEXT;
        }
        if (str.equals("Medf")) {
            return FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS;
        }
        if (str.equals("Mend")) {
            return FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
        }
        if (str.equals("Merc")) {
            return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
        }
        if (str.equals("Mero")) {
            return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
        }
        if (str.equals("Mlym")) {
            return 112;
        }
        if (str.equals("Modi")) {
            return 113;
        }
        if (str.equals("Mong")) {
            return 114;
        }
        if (str.equals("Moon")) {
            return 115;
        }
        if (str.equals("Mroo")) {
            return 116;
        }
        if (str.equals("Mtei")) {
            return ModuleDescriptor.MODULE_VERSION;
        }
        if (str.equals("Mult")) {
            return 118;
        }
        if (str.equals("Mymr")) {
            return 119;
        }
        if (str.equals("Nagm")) {
            return 120;
        }
        if (str.equals("Nand")) {
            return 121;
        }
        if (str.equals("Narb")) {
            return 122;
        }
        if (str.equals("Nbat")) {
            return 123;
        }
        if (str.equals("Newa")) {
            return 124;
        }
        if (str.equals("Nkgb")) {
            return 125;
        }
        if (str.equals("Nkoo")) {
            return 126;
        }
        if (str.equals("Nshu")) {
            return 127;
        }
        if (str.equals("Ogam")) {
            return 128;
        }
        if (str.equals("Olck")) {
            return 129;
        }
        if (str.equals("Onao")) {
            return 130;
        }
        if (str.equals("Orkh")) {
            return 131;
        }
        if (str.equals("Orya")) {
            return 132;
        }
        if (str.equals("Osge")) {
            return 133;
        }
        if (str.equals("Osma")) {
            return 134;
        }
        if (str.equals("Ougr")) {
            return 135;
        }
        if (str.equals("Palm")) {
            return 136;
        }
        if (str.equals("Pauc")) {
            return 137;
        }
        if (str.equals("Perm")) {
            return 138;
        }
        if (str.equals("Phag")) {
            return 139;
        }
        if (str.equals("Phli")) {
            return 140;
        }
        if (str.equals("Phlp")) {
            return 141;
        }
        if (str.equals("Phlv")) {
            return 142;
        }
        if (str.equals("Phnx")) {
            return 143;
        }
        if (str.equals("Plrd")) {
            return 144;
        }
        if (str.equals("Prti")) {
            return 145;
        }
        if (str.equals("Rjng")) {
            return 146;
        }
        if (str.equals("Rohg")) {
            return 147;
        }
        if (str.equals("Roro")) {
            return 148;
        }
        if (str.equals("Runr")) {
            return 149;
        }
        if (str.equals("Samr")) {
            return 150;
        }
        if (str.equals("Sara")) {
            return 151;
        }
        if (str.equals("Sarb")) {
            return 152;
        }
        if (str.equals("Saur")) {
            return 153;
        }
        if (str.equals("Sgnw")) {
            return 154;
        }
        if (str.equals("Shaw")) {
            return 155;
        }
        if (str.equals("Shrd")) {
            return 156;
        }
        if (str.equals("Sidd")) {
            return 157;
        }
        if (str.equals("Sind")) {
            return 158;
        }
        if (str.equals("Sinh")) {
            return 159;
        }
        if (str.equals("Sogd")) {
            return 160;
        }
        if (str.equals("Sogo")) {
            return 161;
        }
        if (str.equals("Sora")) {
            return 162;
        }
        if (str.equals("Soyo")) {
            return 163;
        }
        if (str.equals("Sund")) {
            return 164;
        }
        if (str.equals("Sunu")) {
            return 165;
        }
        if (str.equals("Sylo")) {
            return 166;
        }
        if (str.equals("Syrc")) {
            return 167;
        }
        if (str.equals("Syre")) {
            return 168;
        }
        if (str.equals("Syrj")) {
            return 169;
        }
        if (str.equals("Syrn")) {
            return 170;
        }
        if (str.equals("Tagb")) {
            return 171;
        }
        if (str.equals("Takr")) {
            return 172;
        }
        if (str.equals("Tale")) {
            return 173;
        }
        if (str.equals("Talu")) {
            return 174;
        }
        if (str.equals("Taml")) {
            return 175;
        }
        if (str.equals("Tang")) {
            return 176;
        }
        if (str.equals("Tavt")) {
            return 177;
        }
        if (str.equals("Telu")) {
            return 178;
        }
        if (str.equals("Teng")) {
            return 179;
        }
        if (str.equals("Tfng")) {
            return 180;
        }
        if (str.equals("Tglg")) {
            return 181;
        }
        if (str.equals("Thaa")) {
            return 182;
        }
        if (str.equals("Thai")) {
            return 183;
        }
        if (str.equals("Tibt")) {
            return 184;
        }
        if (str.equals("Tirh")) {
            return 185;
        }
        if (str.equals("Tnsa")) {
            return 186;
        }
        if (str.equals("Todr")) {
            return 187;
        }
        if (str.equals("Toto")) {
            return 188;
        }
        if (str.equals("Tutg")) {
            return 189;
        }
        if (str.equals("Ugar")) {
            return 190;
        }
        if (str.equals("Vaii")) {
            return 191;
        }
        if (str.equals("Visp")) {
            return 192;
        }
        if (str.equals("Vith")) {
            return 193;
        }
        if (str.equals("Wara")) {
            return 194;
        }
        if (str.equals("Wcho")) {
            return 195;
        }
        if (str.equals("Wole")) {
            return 196;
        }
        if (str.equals("Xpeo")) {
            return 197;
        }
        if (str.equals("Xsux")) {
            return 198;
        }
        if (str.equals("Yezi")) {
            return 199;
        }
        if (str.equals("Yiii")) {
            return 200;
        }
        if (str.equals("Zanb")) {
            return 201;
        }
        if (str.equals("Zinh")) {
            return 202;
        }
        if (str.equals("Zmth")) {
            return 203;
        }
        if (str.equals("Zsye")) {
            return 204;
        }
        if (str.equals("Zsym")) {
            return 205;
        }
        if (str.equals("Zxxx")) {
            return 206;
        }
        if (str.equals("Zyyy")) {
            return 207;
        }
        if (str.equals("Zzzz")) {
            return 208;
        }
        q.n("No enum constant com.google.android.gms.internal.mlkit_vision_digital_ink_common.zziu.".concat(str));
        return 0;
    }
}
