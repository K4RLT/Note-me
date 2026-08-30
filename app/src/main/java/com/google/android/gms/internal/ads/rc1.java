package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class rc1 {
    public static final ll1 a(am1 am1Var) {
        ll1 ll1Var;
        String p10;
        int m4 = am1Var.m();
        ll1 f10 = f(am1Var, m4);
        if (f10 == null) {
            return e(am1Var, m4);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int i = am1Var.A;
            if (i == 0) {
                i = am1Var.f();
            }
            String str = null;
            if (i != 2 && i != 4 && i != 17) {
                if (f10 instanceof nl1) {
                    int i10 = am1Var.A;
                    if (i10 == 0) {
                        i10 = am1Var.f();
                    }
                    if (i10 == 14) {
                        p10 = am1Var.r();
                    } else if (i10 == 12) {
                        p10 = am1Var.p('\'');
                    } else if (i10 == 13) {
                        p10 = am1Var.p('\"');
                    } else {
                        throw am1Var.L("a name");
                    }
                    str = p10;
                    am1Var.A = 0;
                    am1Var.F[am1Var.E - 1] = str;
                    if (!x21.r(str)) {
                        q.x.p("illegal characters in string");
                        return null;
                    }
                }
                int m10 = am1Var.m();
                ll1 f11 = f(am1Var, m10);
                if (f11 == null) {
                    ll1Var = e(am1Var, m10);
                } else {
                    ll1Var = f11;
                }
                if (f10 instanceof kl1) {
                    ((kl1) f10).f7801u.add(ll1Var);
                } else {
                    nl1 nl1Var = (nl1) f10;
                    if (!nl1Var.f8756u.containsKey(str)) {
                        nl1Var.f8756u.put(str, ll1Var);
                    } else {
                        q.x.p("duplicate key: ".concat(String.valueOf(str)));
                        return null;
                    }
                }
                if (f11 != null) {
                    arrayDeque.addLast(f10);
                    if (arrayDeque.size() <= 100) {
                        f10 = ll1Var;
                    } else {
                        q.x.p("too many recursions");
                        return null;
                    }
                } else {
                    continue;
                }
            } else {
                boolean z3 = f10 instanceof kl1;
                int i11 = am1Var.A;
                if (z3) {
                    if (i11 == 0) {
                        i11 = am1Var.f();
                    }
                    if (i11 == 4) {
                        int i12 = am1Var.E;
                        am1Var.E = i12 - 1;
                        int[] iArr = am1Var.G;
                        int i13 = i12 - 2;
                        iArr[i13] = iArr[i13] + 1;
                        am1Var.A = 0;
                    } else {
                        throw am1Var.L("END_ARRAY");
                    }
                } else {
                    if (i11 == 0) {
                        i11 = am1Var.f();
                    }
                    if (i11 == 2) {
                        int i14 = am1Var.E;
                        int i15 = i14 - 1;
                        am1Var.E = i15;
                        am1Var.F[i15] = null;
                        int[] iArr2 = am1Var.G;
                        int i16 = i14 - 2;
                        iArr2[i16] = iArr2[i16] + 1;
                        am1Var.A = 0;
                    } else {
                        throw am1Var.L("END_OBJECT");
                    }
                }
                if (arrayDeque.isEmpty()) {
                    return f10;
                }
                f10 = (ll1) arrayDeque.removeLast();
            }
        }
    }

    public static void b(bm1 bm1Var, ll1 ll1Var) {
        String str;
        zl1 zl1Var = bm1Var.f4830u;
        if (ll1Var != null && !(ll1Var instanceof ml1)) {
            if (ll1Var instanceof pl1) {
                pl1 d2 = ll1Var.d();
                Serializable serializable = d2.f9544u;
                if (serializable instanceof Number) {
                    Number g8 = d2.g();
                    bm1Var.k();
                    String obj = g8.toString();
                    Class<?> cls = g8.getClass();
                    if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                            if (cls != Float.class && cls != Double.class && !bm1.D.matcher(obj).matches()) {
                                String valueOf = String.valueOf(cls);
                                q.x.n(a5.a.l(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                                return;
                            }
                        } else if (bm1Var.B != 1) {
                            q.x.n("Numeric values must be finite, but was ".concat(obj));
                            return;
                        }
                    }
                    bm1Var.p();
                    zl1Var.append((CharSequence) obj);
                    return;
                }
                if (serializable instanceof Boolean) {
                    boolean booleanValue = ((Boolean) serializable).booleanValue();
                    bm1Var.k();
                    bm1Var.p();
                    if (true != booleanValue) {
                        str = "false";
                    } else {
                        str = "true";
                    }
                    zl1Var.write(str);
                    return;
                }
                String a10 = d2.a();
                if (a10 == null) {
                    if (bm1Var.C != null) {
                        bm1Var.k();
                    }
                    bm1Var.p();
                    zl1Var.write("null");
                    return;
                }
                bm1Var.k();
                bm1Var.p();
                bm1Var.m(a10);
                return;
            }
            boolean z3 = ll1Var instanceof kl1;
            if (z3) {
                bm1Var.k();
                bm1Var.p();
                int i = bm1Var.f4832w;
                int[] iArr = bm1Var.f4831v;
                if (i == iArr.length) {
                    bm1Var.f4831v = Arrays.copyOf(iArr, i + i);
                }
                int[] iArr2 = bm1Var.f4831v;
                int i10 = bm1Var.f4832w;
                bm1Var.f4832w = i10 + 1;
                iArr2[i10] = 1;
                zl1Var.write(91);
                if (z3) {
                    ArrayList arrayList = ((kl1) ll1Var).f7801u;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        b(bm1Var, (ll1) obj2);
                    }
                    bm1Var.f(1, 2, ']');
                    return;
                }
                q.x.o("Not a JSON Array: ".concat(ll1Var.toString()));
                return;
            }
            if (ll1Var instanceof nl1) {
                bm1Var.k();
                bm1Var.p();
                int i12 = bm1Var.f4832w;
                int[] iArr3 = bm1Var.f4831v;
                if (i12 == iArr3.length) {
                    bm1Var.f4831v = Arrays.copyOf(iArr3, i12 + i12);
                }
                int[] iArr4 = bm1Var.f4831v;
                int i13 = bm1Var.f4832w;
                bm1Var.f4832w = i13 + 1;
                iArr4[i13] = 3;
                zl1Var.write(123);
                Iterator it = ((sl1) ll1Var.b().f8756u.entrySet()).iterator();
                while (((ul1) it).hasNext()) {
                    vl1 a11 = ((rl1) it).a();
                    String str2 = (String) a11.getKey();
                    Objects.requireNonNull(str2, "name == null");
                    if (bm1Var.C == null) {
                        int j10 = bm1Var.j();
                        if (j10 != 3 && j10 != 5) {
                            q.x.o("Please begin an object before writing a name.");
                            return;
                        } else {
                            bm1Var.C = str2;
                            b(bm1Var, (ll1) a11.getValue());
                        }
                    } else {
                        q.x.o("Already wrote a name, expecting a value.");
                        return;
                    }
                }
                bm1Var.f(3, 5, '}');
                return;
            }
            q.x.n("Couldn't write ".concat(String.valueOf(ll1Var.getClass())));
            return;
        }
        if (bm1Var.C != null) {
            bm1Var.k();
        }
        bm1Var.p();
        zl1Var.write("null");
    }

    public static boolean c(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (i == 26 || i == 27)) {
            return true;
        }
        if (i10 >= 33 && i == 30) {
            return true;
        }
        return false;
    }

    public static int d(String str) {
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                try {
                    int i12 = cp1.f5140a;
                    int length2 = str.length();
                    while (i10 < length2) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) >= 65536) {
                                    i10++;
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(length2).length());
                                    sb2.append("Unpaired surrogate at index ");
                                    sb2.append(i10);
                                    sb2.append(" of ");
                                    sb2.append(length2);
                                    throw new Exception(sb2.toString());
                                }
                            }
                        }
                        i10++;
                    }
                    i11 += i;
                } catch (bp1 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j10 = i11 + 4294967296L;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(j10);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static final ll1 e(am1 am1Var, int i) {
        int i10 = i - 1;
        if (i10 != 5) {
            if (i10 != 6) {
                boolean z3 = true;
                if (i10 != 7) {
                    if (i10 == 8) {
                        int i11 = am1Var.A;
                        if (i11 == 0) {
                            i11 = am1Var.f();
                        }
                        if (i11 == 7) {
                            am1Var.A = 0;
                            int[] iArr = am1Var.G;
                            int i12 = am1Var.E - 1;
                            iArr[i12] = iArr[i12] + 1;
                            return ml1.f8376u;
                        }
                        throw am1Var.L("null");
                    }
                    q.x.o("Unexpected token: ".concat(lr1.a(i)));
                    return null;
                }
                int i13 = am1Var.A;
                if (i13 == 0) {
                    i13 = am1Var.f();
                }
                if (i13 == 5) {
                    am1Var.A = 0;
                    int[] iArr2 = am1Var.G;
                    int i14 = am1Var.E - 1;
                    iArr2[i14] = iArr2[i14] + 1;
                } else if (i13 == 6) {
                    am1Var.A = 0;
                    int[] iArr3 = am1Var.G;
                    int i15 = am1Var.E - 1;
                    iArr3[i15] = iArr3[i15] + 1;
                    z3 = false;
                } else {
                    throw am1Var.L("a boolean");
                }
                return new pl1(Boolean.valueOf(z3));
            }
            return new pl1(new sc1(am1Var.j()));
        }
        String j10 = am1Var.j();
        if (x21.r(j10)) {
            return new pl1(j10);
        }
        q.x.p("illegal characters in string");
        return null;
    }

    public static final ll1 f(am1 am1Var, int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                return null;
            }
            int i11 = am1Var.A;
            if (i11 == 0) {
                i11 = am1Var.f();
            }
            if (i11 == 1) {
                am1Var.w(3);
                am1Var.A = 0;
                return new nl1();
            }
            throw am1Var.L("BEGIN_OBJECT");
        }
        int i12 = am1Var.A;
        if (i12 == 0) {
            i12 = am1Var.f();
        }
        if (i12 == 3) {
            am1Var.w(1);
            am1Var.G[am1Var.E - 1] = 0;
            am1Var.A = 0;
            return new kl1();
        }
        throw am1Var.L("BEGIN_ARRAY");
    }
}
