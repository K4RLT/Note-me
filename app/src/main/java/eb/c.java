package eb;
import d.b;
import q0.d;

import com.google.android.gms.internal.measurement.b5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f16073a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f16074b;

    /* renamed from: c, reason: collision with root package name */
    public Long f16075c;

    /* renamed from: d, reason: collision with root package name */
    public Long f16076d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public b5 f16077f;

    public /* synthetic */ c(int i) {
        this.e = i;
    }

    public static Boolean a(Boolean bool, boolean z3) {
        boolean z9;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z3) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean b(String str, com.google.android.gms.internal.measurement.y1 y1Var, k0 k0Var) {
        String s10;
        List t3;
        String str2;
        int i;
        fa.y.h(y1Var);
        if (str != null && y1Var.x() && y1Var.q() != 1 && (y1Var.q() != 7 ? y1Var.w() : y1Var.p() != 0)) {
            int q10 = y1Var.q();
            boolean u9 = y1Var.u();
            if (!u9 && q10 != 2 && q10 != 7) {
                s10 = y1Var.s().toUpperCase(Locale.ENGLISH);
            } else {
                s10 = y1Var.s();
            }
            if (y1Var.p() == 0) {
                t3 = null;
            } else {
                t3 = y1Var.t();
                if (!u9) {
                    ArrayList arrayList = new ArrayList(t3.size());
                    Iterator it = t3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    t3 = Collections.unmodifiableList(arrayList);
                }
            }
            if (q10 == 2) {
                str2 = s10;
            } else {
                str2 = null;
            }
            if (q10 != 7 ? s10 != null : t3 != null && !t3.isEmpty()) {
                if (!u9 && q10 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (p3.f16314a[d.b(q10)]) {
                    case 1:
                        if (str2 != null) {
                            if (u9) {
                                i = 0;
                            } else {
                                i = 66;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                k0Var.D.f(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                break;
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(s10));
                    case 3:
                        return Boolean.valueOf(str.endsWith(s10));
                    case 4:
                        return Boolean.valueOf(str.contains(s10));
                    case 5:
                        return Boolean.valueOf(str.equals(s10));
                    case 6:
                        if (t3 != null) {
                            return Boolean.valueOf(t3.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean c(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.v1 v1Var, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        fa.y.h(v1Var);
        if (v1Var.v()) {
            boolean z3 = true;
            if (v1Var.p() != 1 && (v1Var.p() != 5 ? v1Var.w() : v1Var.z() && v1Var.y())) {
                int p10 = v1Var.p();
                try {
                    if (v1Var.p() == 5) {
                        if (m0.i0(v1Var.t()) && m0.i0(v1Var.s())) {
                            BigDecimal bigDecimal5 = new BigDecimal(v1Var.t());
                            bigDecimal4 = new BigDecimal(v1Var.s());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (m0.i0(v1Var.r())) {
                        bigDecimal2 = new BigDecimal(v1Var.r());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (p10 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = p3.f16315b[d.b(p10)];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z3 = false;
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d2 != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) >= 0) {
                                            z3 = false;
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z3 = false;
                                    }
                                    return Boolean.valueOf(z3);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z3 = false;
                                }
                                return Boolean.valueOf(z3);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
