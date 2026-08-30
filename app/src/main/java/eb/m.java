package eb;
import o1.a;
import o1.b;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f16228f = new m((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f16229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16230b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f16231c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16232d;
    public final EnumMap e;

    public m(Boolean bool, int i, Boolean bool2, String str) {
        m1 m1Var;
        EnumMap enumMap = new EnumMap(n1.class);
        this.e = enumMap;
        if (bool == null) {
            m1Var = m1.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            m1Var = m1.GRANTED;
        } else {
            m1Var = m1.DENIED;
        }
        enumMap.put((EnumMap) n1.AD_USER_DATA, (n1) m1Var);
        this.f16229a = i;
        this.f16230b = e();
        this.f16231c = bool2;
        this.f16232d = str;
    }

    public static m a(int i, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new m((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(n1.class);
        for (n1 n1Var : p1.DMA.f16312u) {
            enumMap.put((EnumMap) n1Var, (n1) o1.c(bundle.getString(n1Var.f16278u)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new m(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public static m b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(n1.class);
            n1[] n1VarArr = p1.DMA.f16312u;
            int length = n1VarArr.length;
            int i = 1;
            int i10 = 0;
            while (i10 < length) {
                enumMap.put((EnumMap) n1VarArr[i10], (n1) b(split[i].charAt(0)));
                i10++;
                i++;
            }
            return new m(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f16228f;
    }

    public static Boolean c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = o.f16282a[o1.c(bundle.getString("ad_personalization")).ordinal()];
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final m1 d() {
        m1 m1Var = (m1) this.e.get(n1.AD_USER_DATA);
        if (m1Var == null) {
            return m1.UNINITIALIZED;
        }
        return m1Var;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16229a);
        for (n1 n1Var : p1.DMA.f16312u) {
            sb2.append(":");
            sb2.append(a((m1) this.e.get(n1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f16230b.equalsIgnoreCase(mVar.f16230b) || !Objects.equals(this.f16231c, mVar.f16231c)) {
            return false;
        }
        return Objects.equals(this.f16232d, mVar.f16232d);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.f16231c;
        if (bool == null) {
            i = 3;
        } else if (bool == Boolean.TRUE) {
            i = 7;
        } else {
            i = 13;
        }
        String str = this.f16232d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + (i * 29) + this.f16230b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(o1.g(this.f16229a));
        for (n1 n1Var : p1.DMA.f16312u) {
            sb2.append(",");
            sb2.append(n1Var.f16278u);
            sb2.append("=");
            m1 m1Var = (m1) this.e.get(n1Var);
            if (m1Var == null) {
                sb2.append("uninitialized");
            } else {
                int i = o.f16282a[m1Var.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                sb2.append("granted");
                            }
                        } else {
                            sb2.append("denied");
                        }
                    } else {
                        sb2.append("eu_consent_policy");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        Boolean bool = this.f16231c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f16232d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public m(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16229a = i;
        this.f16230b = e();
        this.f16231c = bool;
        this.f16232d = str;
    }
}
