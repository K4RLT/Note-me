package ie;

import androidx.ink.brush.color.colorspace.ColorSpace;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.gl;
import fa.y;
import g5.q;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xa.q2;
import xa.r2;
import xa.s2;
import xa.t2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18434b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18435c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18436d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18437f;

    public a(String str) {
        String str2;
        String str3;
        CharSequence obj;
        CharSequence obj2;
        try {
            s2 a10 = s2.a(str);
            String str4 = a10.f30524v;
            Objects.requireNonNull(str4);
            Object obj3 = s2.b(2, str4).f30523u;
            Object obj4 = c.f18441a.get(obj3);
            String str5 = (String) (obj4 != null ? obj4 : obj3);
            this.f18433a = str5;
            this.f18436d = (String) c.f18442b.get(str5);
            int i = a10.f30525w;
            if (i != 0) {
                if (i == 0) {
                    q.h("null reference");
                }
                switch (i) {
                    case 1:
                        str2 = "Adlm";
                        break;
                    case 2:
                        str2 = "Afak";
                        break;
                    case 3:
                        str2 = "Aghb";
                        break;
                    case 4:
                        str2 = "Ahom";
                        break;
                    case 5:
                        str2 = "Arab";
                        break;
                    case 6:
                        str2 = "Aran";
                        break;
                    case 7:
                        str2 = "Armi";
                        break;
                    case 8:
                        str2 = "Armn";
                        break;
                    case 9:
                        str2 = "Avst";
                        break;
                    case 10:
                        str2 = "Bali";
                        break;
                    case 11:
                        str2 = "Bamu";
                        break;
                    case 12:
                        str2 = "Bass";
                        break;
                    case 13:
                        str2 = "Batk";
                        break;
                    case 14:
                        str2 = "Beng";
                        break;
                    case 15:
                        str2 = "Bhks";
                        break;
                    case 16:
                        str2 = "Blis";
                        break;
                    case 17:
                        str2 = "Bopo";
                        break;
                    case 18:
                        str2 = "Brah";
                        break;
                    case 19:
                        str2 = "Brai";
                        break;
                    case 20:
                        str2 = "Bugi";
                        break;
                    case gl.zzm /* 21 */:
                        str2 = "Buhd";
                        break;
                    case 22:
                        str2 = "Cakm";
                        break;
                    case 23:
                        str2 = "Cans";
                        break;
                    case 24:
                        str2 = "Cari";
                        break;
                    case 25:
                        str2 = "Cham";
                        break;
                    case 26:
                        str2 = "Cher";
                        break;
                    case 27:
                        str2 = "Chrs";
                        break;
                    case 28:
                        str2 = "Cirt";
                        break;
                    case 29:
                        str2 = "Copt";
                        break;
                    case 30:
                        str2 = "Cpmn";
                        break;
                    case 31:
                        str2 = "Cprt";
                        break;
                    case 32:
                        str2 = "Cyrl";
                        break;
                    case 33:
                        str2 = "Cyrs";
                        break;
                    case 34:
                        str2 = "Deva";
                        break;
                    case 35:
                        str2 = "Diak";
                        break;
                    case 36:
                        str2 = "Dogr";
                        break;
                    case 37:
                        str2 = "Dsrt";
                        break;
                    case 38:
                        str2 = "Dupl";
                        break;
                    case 39:
                        str2 = "Egyd";
                        break;
                    case 40:
                        str2 = "Egyh";
                        break;
                    case 41:
                        str2 = "Egyp";
                        break;
                    case 42:
                        str2 = "Elba";
                        break;
                    case 43:
                        str2 = "Elym";
                        break;
                    case 44:
                        str2 = "Ethi";
                        break;
                    case 45:
                        str2 = "Gara";
                        break;
                    case 46:
                        str2 = "Geok";
                        break;
                    case 47:
                        str2 = "Geor";
                        break;
                    case 48:
                        str2 = "Glag";
                        break;
                    case 49:
                        str2 = "Gong";
                        break;
                    case 50:
                        str2 = "Gonm";
                        break;
                    case 51:
                        str2 = "Goth";
                        break;
                    case 52:
                        str2 = "Gran";
                        break;
                    case 53:
                        str2 = "Grek";
                        break;
                    case 54:
                        str2 = "Gujr";
                        break;
                    case 55:
                        str2 = "Gukh";
                        break;
                    case 56:
                        str2 = "Guru";
                        break;
                    case 57:
                        str2 = "Hanb";
                        break;
                    case 58:
                        str2 = "Hang";
                        break;
                    case 59:
                        str2 = "Hani";
                        break;
                    case 60:
                        str2 = "Hano";
                        break;
                    case 61:
                        str2 = "Hans";
                        break;
                    case 62:
                        str2 = "Hant";
                        break;
                    case ColorSpace.MAX_ID /* 63 */:
                        str2 = "Hatr";
                        break;
                    case 64:
                        str2 = "Hebr";
                        break;
                    case 65:
                        str2 = "Hira";
                        break;
                    case 66:
                        str2 = "Hluw";
                        break;
                    case 67:
                        str2 = "Hmng";
                        break;
                    case 68:
                        str2 = "Hmnp";
                        break;
                    case 69:
                        str2 = "Hrkt";
                        break;
                    case 70:
                        str2 = "Hung";
                        break;
                    case 71:
                        str2 = "Inds";
                        break;
                    case 72:
                        str2 = "Ital";
                        break;
                    case 73:
                        str2 = "Jamo";
                        break;
                    case 74:
                        str2 = "Java";
                        break;
                    case 75:
                        str2 = "Jpan";
                        break;
                    case 76:
                        str2 = "Jurc";
                        break;
                    case 77:
                        str2 = "Kali";
                        break;
                    case 78:
                        str2 = "Kana";
                        break;
                    case 79:
                        str2 = "Kawi";
                        break;
                    case 80:
                        str2 = "Khar";
                        break;
                    case 81:
                        str2 = "Khmr";
                        break;
                    case 82:
                        str2 = "Khoj";
                        break;
                    case 83:
                        str2 = "Kits";
                        break;
                    case 84:
                        str2 = "Knda";
                        break;
                    case 85:
                        str2 = "Kore";
                        break;
                    case 86:
                        str2 = "Kpel";
                        break;
                    case 87:
                        str2 = "Krai";
                        break;
                    case 88:
                        str2 = "Kthi";
                        break;
                    case 89:
                        str2 = "Lana";
                        break;
                    case 90:
                        str2 = "Laoo";
                        break;
                    case 91:
                        str2 = "Latf";
                        break;
                    case 92:
                        str2 = "Latg";
                        break;
                    case 93:
                        str2 = "Latn";
                        break;
                    case 94:
                        str2 = "Lepc";
                        break;
                    case 95:
                        str2 = "Limb";
                        break;
                    case 96:
                        str2 = "Lina";
                        break;
                    case 97:
                        str2 = "Linb";
                        break;
                    case 98:
                        str2 = "Lisu";
                        break;
                    case 99:
                        str2 = "Loma";
                        break;
                    case AdSizeApi.INTERSTITIAL /* 100 */:
                        str2 = "Lyci";
                        break;
                    case FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS /* 101 */:
                        str2 = "Lydi";
                        break;
                    case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                        str2 = "Mahj";
                        break;
                    case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                        str2 = "Maka";
                        break;
                    case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                        str2 = "Mand";
                        break;
                    case FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS /* 105 */:
                        str2 = "Mani";
                        break;
                    case FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE /* 106 */:
                        str2 = "Marc";
                        break;
                    case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                        str2 = "Maya";
                        break;
                    case FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS /* 108 */:
                        str2 = "Medf";
                        break;
                    case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                        str2 = "Mend";
                        break;
                    case FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD /* 110 */:
                        str2 = "Merc";
                        break;
                    case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                        str2 = "Mero";
                        break;
                    case 112:
                        str2 = "Mlym";
                        break;
                    case 113:
                        str2 = "Modi";
                        break;
                    case 114:
                        str2 = "Mong";
                        break;
                    case 115:
                        str2 = "Moon";
                        break;
                    case 116:
                        str2 = "Mroo";
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 117 */:
                        str2 = "Mtei";
                        break;
                    case 118:
                        str2 = "Mult";
                        break;
                    case 119:
                        str2 = "Mymr";
                        break;
                    case 120:
                        str2 = "Nagm";
                        break;
                    case 121:
                        str2 = "Nand";
                        break;
                    case 122:
                        str2 = "Narb";
                        break;
                    case 123:
                        str2 = "Nbat";
                        break;
                    case 124:
                        str2 = "Newa";
                        break;
                    case 125:
                        str2 = "Nkgb";
                        break;
                    case 126:
                        str2 = "Nkoo";
                        break;
                    case 127:
                        str2 = "Nshu";
                        break;
                    case 128:
                        str2 = "Ogam";
                        break;
                    case 129:
                        str2 = "Olck";
                        break;
                    case 130:
                        str2 = "Onao";
                        break;
                    case 131:
                        str2 = "Orkh";
                        break;
                    case 132:
                        str2 = "Orya";
                        break;
                    case 133:
                        str2 = "Osge";
                        break;
                    case 134:
                        str2 = "Osma";
                        break;
                    case 135:
                        str2 = "Ougr";
                        break;
                    case 136:
                        str2 = "Palm";
                        break;
                    case 137:
                        str2 = "Pauc";
                        break;
                    case 138:
                        str2 = "Perm";
                        break;
                    case 139:
                        str2 = "Phag";
                        break;
                    case 140:
                        str2 = "Phli";
                        break;
                    case 141:
                        str2 = "Phlp";
                        break;
                    case 142:
                        str2 = "Phlv";
                        break;
                    case 143:
                        str2 = "Phnx";
                        break;
                    case 144:
                        str2 = "Plrd";
                        break;
                    case 145:
                        str2 = "Prti";
                        break;
                    case 146:
                        str2 = "Rjng";
                        break;
                    case 147:
                        str2 = "Rohg";
                        break;
                    case 148:
                        str2 = "Roro";
                        break;
                    case 149:
                        str2 = "Runr";
                        break;
                    case 150:
                        str2 = "Samr";
                        break;
                    case 151:
                        str2 = "Sara";
                        break;
                    case 152:
                        str2 = "Sarb";
                        break;
                    case 153:
                        str2 = "Saur";
                        break;
                    case 154:
                        str2 = "Sgnw";
                        break;
                    case 155:
                        str2 = "Shaw";
                        break;
                    case 156:
                        str2 = "Shrd";
                        break;
                    case 157:
                        str2 = "Sidd";
                        break;
                    case 158:
                        str2 = "Sind";
                        break;
                    case 159:
                        str2 = "Sinh";
                        break;
                    case 160:
                        str2 = "Sogd";
                        break;
                    case 161:
                        str2 = "Sogo";
                        break;
                    case 162:
                        str2 = "Sora";
                        break;
                    case 163:
                        str2 = "Soyo";
                        break;
                    case 164:
                        str2 = "Sund";
                        break;
                    case 165:
                        str2 = "Sunu";
                        break;
                    case 166:
                        str2 = "Sylo";
                        break;
                    case 167:
                        str2 = "Syrc";
                        break;
                    case 168:
                        str2 = "Syre";
                        break;
                    case 169:
                        str2 = "Syrj";
                        break;
                    case 170:
                        str2 = "Syrn";
                        break;
                    case 171:
                        str2 = "Tagb";
                        break;
                    case 172:
                        str2 = "Takr";
                        break;
                    case 173:
                        str2 = "Tale";
                        break;
                    case 174:
                        str2 = "Talu";
                        break;
                    case 175:
                        str2 = "Taml";
                        break;
                    case 176:
                        str2 = "Tang";
                        break;
                    case 177:
                        str2 = "Tavt";
                        break;
                    case 178:
                        str2 = "Telu";
                        break;
                    case 179:
                        str2 = "Teng";
                        break;
                    case 180:
                        str2 = "Tfng";
                        break;
                    case 181:
                        str2 = "Tglg";
                        break;
                    case 182:
                        str2 = "Thaa";
                        break;
                    case 183:
                        str2 = "Thai";
                        break;
                    case 184:
                        str2 = "Tibt";
                        break;
                    case 185:
                        str2 = "Tirh";
                        break;
                    case 186:
                        str2 = "Tnsa";
                        break;
                    case 187:
                        str2 = "Todr";
                        break;
                    case 188:
                        str2 = "Toto";
                        break;
                    case 189:
                        str2 = "Tutg";
                        break;
                    case 190:
                        str2 = "Ugar";
                        break;
                    case 191:
                        str2 = "Vaii";
                        break;
                    case 192:
                        str2 = "Visp";
                        break;
                    case 193:
                        str2 = "Vith";
                        break;
                    case 194:
                        str2 = "Wara";
                        break;
                    case 195:
                        str2 = "Wcho";
                        break;
                    case 196:
                        str2 = "Wole";
                        break;
                    case 197:
                        str2 = "Xpeo";
                        break;
                    case 198:
                        str2 = "Xsux";
                        break;
                    case 199:
                        str2 = "Yezi";
                        break;
                    case 200:
                        str2 = "Yiii";
                        break;
                    case 201:
                        str2 = "Zanb";
                        break;
                    case 202:
                        str2 = "Zinh";
                        break;
                    case 203:
                        str2 = "Zmth";
                        break;
                    case 204:
                        str2 = "Zsye";
                        break;
                    case 205:
                        str2 = "Zsym";
                        break;
                    case 206:
                        str2 = "Zxxx";
                        break;
                    case 207:
                        str2 = "Zyyy";
                        break;
                    case 208:
                        str2 = "Zzzz";
                        break;
                    default:
                        throw null;
                }
            } else {
                str2 = (String) c.f18443c.get(str5);
            }
            this.f18434b = str2;
            this.e = (String) c.e.get(str2);
            t2 t2Var = a10.f30526x;
            if (t2Var != null) {
                str3 = t2Var.f30681u;
            } else {
                str3 = null;
            }
            this.f18435c = str3;
            List asList = Arrays.asList(str.split("-"));
            int indexOf = asList.indexOf("x");
            if (indexOf >= 0) {
                Iterator it = asList.subList(indexOf + 1, asList.size()).iterator();
                StringBuilder sb2 = new StringBuilder();
                try {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Objects.requireNonNull(next);
                        if (next instanceof CharSequence) {
                            obj = (CharSequence) next;
                        } else {
                            obj = next.toString();
                        }
                        sb2.append(obj);
                        while (it.hasNext()) {
                            sb2.append((CharSequence) "-");
                            Object next2 = it.next();
                            Objects.requireNonNull(next2);
                            if (next2 instanceof CharSequence) {
                                obj2 = (CharSequence) next2;
                            } else {
                                obj2 = next2.toString();
                            }
                            sb2.append(obj2);
                        }
                    }
                } catch (IOException e) {
                    q.f(e);
                }
                this.f18437f = sb2.toString();
                return;
            }
            this.f18437f = null;
        } catch (q2 | r2 e8) {
            throw new zd.a(p.a.k("Invalid language code in BCP 47 language tag '", str, "'."), e8);
        }
    }

    public final int a(a aVar) {
        int i;
        String str;
        String str2 = aVar.f18433a;
        String str3 = aVar.f18437f;
        String str4 = aVar.f18435c;
        if (this.f18433a.equals(str2)) {
            i = 17;
        } else if (str2.equals(this.f18436d)) {
            i = 1;
        } else {
            return 0;
        }
        String str5 = this.f18434b;
        if (str5 != null && (str = aVar.f18434b) != null) {
            if (str5.equals(str)) {
                i += 8;
            } else if (!str.equals(this.e)) {
                return 0;
            }
        }
        String str6 = this.f18435c;
        if ((str6 == null && str4 == null) || (str6 != null && str6.equals(str4))) {
            i += 4;
        } else {
            Collection collection = (Collection) c.f18444d.a().get(str4);
            if (collection != null && collection.contains(str6)) {
                i += 2;
            } else if (str6 != null && str4 != null) {
                return 0;
            }
        }
        String str7 = this.f18437f;
        if ((str7 == null && str3 == null) || (str7 != null && str7.equals(str3))) {
            return i + 1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!y.l(this.f18433a, aVar.f18433a) || !y.l(this.f18434b, aVar.f18434b) || !y.l(this.f18435c, aVar.f18435c) || !y.l(this.f18436d, aVar.f18436d) || !y.l(this.e, aVar.e) || !y.l(this.f18437f, aVar.f18437f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f18433a, this.f18434b, this.f18435c, this.f18436d, this.e, this.f18437f});
    }
}
