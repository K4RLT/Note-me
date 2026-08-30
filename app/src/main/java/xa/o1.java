package xa;
import n.a;
import p.a;
import q.x;

import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ul1;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class o1 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f30488b = new o1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30489a;

    public /* synthetic */ o1(int i) {
        this.f30489a = i;
    }

    public static void c(m2 m2Var, b0 b0Var) {
        String str;
        StringWriter stringWriter = m2Var.f30467u;
        if (b0Var != null && !(b0Var instanceof d0)) {
            if (b0Var instanceof f0) {
                f0 f0Var = (f0) b0Var;
                Serializable serializable = f0Var.f30411u;
                if (serializable instanceof Number) {
                    Number a10 = f0Var.a();
                    m2Var.p();
                    String obj = a10.toString();
                    Class<?> cls = a10.getClass();
                    if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                            if (cls != Float.class && cls != Double.class && !m2.D.matcher(obj).matches()) {
                                x.n(a.l("String created by ", String.valueOf(cls), " is not a valid JSON number: ", obj));
                                return;
                            }
                        } else if (m2Var.B != 1) {
                            x.n("Numeric values must be finite, but was ".concat(obj));
                            return;
                        }
                    }
                    m2Var.k();
                    stringWriter.append((CharSequence) obj);
                    return;
                }
                if (serializable instanceof Boolean) {
                    boolean booleanValue = ((Boolean) serializable).booleanValue();
                    m2Var.p();
                    m2Var.k();
                    if (true != booleanValue) {
                        str = "false";
                    } else {
                        str = "true";
                    }
                    stringWriter.write(str);
                    return;
                }
                String b10 = f0Var.b();
                if (b10 == null) {
                    if (m2Var.C != null) {
                        m2Var.p();
                    }
                    m2Var.k();
                    stringWriter.write("null");
                    return;
                }
                m2Var.p();
                m2Var.k();
                m2Var.o(b10);
                return;
            }
            if (b0Var instanceof a0) {
                m2Var.p();
                m2Var.k();
                int i = m2Var.f30469w;
                int[] iArr = m2Var.f30468v;
                if (i == iArr.length) {
                    m2Var.f30468v = Arrays.copyOf(iArr, i + i);
                }
                int[] iArr2 = m2Var.f30468v;
                int i10 = m2Var.f30469w;
                m2Var.f30469w = i10 + 1;
                iArr2[i10] = 1;
                stringWriter.write(91);
                ArrayList arrayList = ((a0) b0Var).f30352u;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    c(m2Var, (b0) obj2);
                }
                m2Var.j(1, 2, ']');
                return;
            }
            if (b0Var instanceof e0) {
                m2Var.p();
                m2Var.k();
                int i12 = m2Var.f30469w;
                int[] iArr3 = m2Var.f30468v;
                if (i12 == iArr3.length) {
                    m2Var.f30468v = Arrays.copyOf(iArr3, i12 + i12);
                }
                int[] iArr4 = m2Var.f30468v;
                int i13 = m2Var.f30469w;
                m2Var.f30469w = i13 + 1;
                iArr4[i13] = 3;
                stringWriter.write(123);
                Iterator it = ((z0) ((e0) b0Var).f30407u.entrySet()).iterator();
                while (((ul1) it).hasNext()) {
                    a1 b11 = ((y0) it).b();
                    String str2 = (String) b11.getKey();
                    Objects.requireNonNull(str2, "name == null");
                    if (m2Var.C == null) {
                        int f10 = m2Var.f();
                        if (f10 != 3 && f10 != 5) {
                            x.o("Please begin an object before writing a name.");
                            return;
                        } else {
                            m2Var.C = str2;
                            c(m2Var, (b0) b11.getValue());
                        }
                    } else {
                        x.o("Already wrote a name, expecting a value.");
                        return;
                    }
                }
                m2Var.j(3, 5, '}');
                return;
            }
            x.n("Couldn't write ".concat(String.valueOf(b0Var.getClass())));
            return;
        }
        if (m2Var.C != null) {
            m2Var.p();
        }
        m2Var.k();
        stringWriter.write("null");
    }

    public static final b0 d(l2 l2Var, int i) {
        int i10 = i - 1;
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 == 8) {
                        l2Var.Y();
                        return d0.f30402u;
                    }
                    x.o("Unexpected token: ".concat(u0.c(i)));
                    return null;
                }
                return new f0(Boolean.valueOf(l2Var.b0()));
            }
            return new f0(new w0(l2Var.O()));
        }
        return new f0(l2Var.O());
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        b0 a0Var;
        String str;
        b0 a0Var2;
        b0 b0Var;
        String str2;
        String str3;
        switch (this.f30489a) {
            case 0:
                int c02 = l2Var.c0();
                int i = c02 - 1;
                if (i != 0) {
                    if (i != 2) {
                        a0Var = null;
                    } else {
                        l2Var.V();
                        a0Var = new e0();
                    }
                } else {
                    l2Var.R();
                    a0Var = new a0();
                }
                if (a0Var == null) {
                    return d(l2Var, c02);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (l2Var.a0()) {
                        if (a0Var instanceof e0) {
                            str = l2Var.N();
                        } else {
                            str = null;
                        }
                        int c03 = l2Var.c0();
                        int i10 = c03 - 1;
                        if (i10 != 0) {
                            if (i10 != 2) {
                                a0Var2 = null;
                            } else {
                                l2Var.V();
                                a0Var2 = new e0();
                            }
                        } else {
                            l2Var.R();
                            a0Var2 = new a0();
                        }
                        if (a0Var2 == null) {
                            b0Var = d(l2Var, c03);
                        } else {
                            b0Var = a0Var2;
                        }
                        if (a0Var instanceof a0) {
                            ((a0) a0Var).f30352u.add(b0Var);
                        } else {
                            ((e0) a0Var).f30407u.put(str, b0Var);
                        }
                        if (a0Var2 != null) {
                            arrayDeque.addLast(a0Var);
                            a0Var = b0Var;
                        }
                    } else {
                        if (a0Var instanceof a0) {
                            l2Var.W();
                        } else {
                            l2Var.X();
                        }
                        if (!arrayDeque.isEmpty()) {
                            a0Var = (b0) arrayDeque.removeLast();
                        } else {
                            return a0Var;
                        }
                    }
                }
            case 1:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return Double.valueOf(l2Var.B());
            case 2:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return Float.valueOf((float) l2Var.B());
            case 3:
                l2Var.Z();
                return null;
            case 4:
                ArrayList arrayList = new ArrayList();
                l2Var.R();
                while (l2Var.a0()) {
                    try {
                        arrayList.add(Integer.valueOf(l2Var.K()));
                    } catch (NumberFormatException e) {
                        throw new ab.b(21, e);
                    }
                }
                l2Var.W();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
                }
                return atomicIntegerArray;
            case 5:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                try {
                    return Long.valueOf(l2Var.L());
                } catch (NumberFormatException e8) {
                    throw new ab.b(21, e8);
                }
            case 6:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O = l2Var.O();
                if (O.length() == 1) {
                    return Character.valueOf(O.charAt(0));
                }
                throw new ab.b(a.l("Expecting character, got: ", O, "; at ", l2Var.h0(true)), 21);
            case 7:
                int c04 = l2Var.c0();
                if (c04 == 9) {
                    l2Var.Y();
                    return null;
                }
                if (c04 == 8) {
                    return Boolean.toString(l2Var.b0());
                }
                return l2Var.O();
            case 8:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O2 = l2Var.O();
                try {
                    return u0.g(O2);
                } catch (NumberFormatException e10) {
                    throw new ab.b(21, a.l("Failed parsing '", O2, "' as BigDecimal; at path ", l2Var.h0(true)), e10);
                }
            case 9:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O3 = l2Var.O();
                try {
                    u0.x(O3);
                    return new BigInteger(O3);
                } catch (NumberFormatException e11) {
                    throw new ab.b(21, a.l("Failed parsing '", O3, "' as BigInteger; at path ", l2Var.h0(true)), e11);
                }
            case 10:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return new w0(l2Var.O());
            case 11:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return new StringBuilder(l2Var.O());
            case 12:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#java-lang-class-unsupported");
            case 13:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return new StringBuffer(l2Var.O());
            case 14:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                } else {
                    String O4 = l2Var.O();
                    if (!O4.equals("null")) {
                        return new URL(O4);
                    }
                }
                return null;
            case 15:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                try {
                    String O5 = l2Var.O();
                    if (O5.equals("null")) {
                        return null;
                    }
                    return new URI(O5);
                } catch (URISyntaxException e12) {
                    throw new ab.b(21, e12);
                }
            case 16:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return InetAddress.getByName(l2Var.O());
            case 17:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O6 = l2Var.O();
                try {
                    return UUID.fromString(O6);
                } catch (IllegalArgumentException e13) {
                    throw new ab.b(21, a.l("Failed parsing '", O6, "' as UUID; at path ", l2Var.h0(true)), e13);
                }
            case 18:
                String O7 = l2Var.O();
                try {
                    return Currency.getInstance(O7);
                } catch (IllegalArgumentException e14) {
                    throw new ab.b(21, a.l("Failed parsing '", O7, "' as Currency; at path ", l2Var.h0(true)), e14);
                }
            case 19:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                l2Var.V();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (l2Var.c0() != 4) {
                    String N = l2Var.N();
                    int K = l2Var.K();
                    switch (N.hashCode()) {
                        case -1181204563:
                            if (N.equals("dayOfMonth")) {
                                i14 = K;
                                break;
                            } else {
                                break;
                            }
                        case -1074026988:
                            if (N.equals("minute")) {
                                i16 = K;
                                break;
                            } else {
                                break;
                            }
                        case -906279820:
                            if (N.equals("second")) {
                                i17 = K;
                                break;
                            } else {
                                break;
                            }
                        case 3704893:
                            if (N.equals("year")) {
                                i12 = K;
                                break;
                            } else {
                                break;
                            }
                        case 104080000:
                            if (N.equals("month")) {
                                i13 = K;
                                break;
                            } else {
                                break;
                            }
                        case 985252545:
                            if (N.equals("hourOfDay")) {
                                i15 = K;
                                break;
                            } else {
                                break;
                            }
                    }
                }
                l2Var.X();
                return new GregorianCalendar(i12, i13, i14, i15, i16, i17);
            case 20:
                String str4 = null;
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(l2Var.O(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                } else {
                    str3 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str4 = stringTokenizer.nextToken();
                }
                if (str3 == null && str4 == null) {
                    return new Locale(str2);
                }
                if (str4 == null) {
                    return new Locale(str2, str3);
                }
                return new Locale(str2, str3, str4);
            case gl.zzm /* 21 */:
                BitSet bitSet = new BitSet();
                l2Var.R();
                int c05 = l2Var.c0();
                int i18 = 0;
                while (c05 != 2) {
                    int i19 = c05 - 1;
                    if (i19 != 5 && i19 != 6) {
                        if (i19 == 7) {
                            if (!l2Var.b0()) {
                                i18++;
                                c05 = l2Var.c0();
                            }
                            bitSet.set(i18);
                            i18++;
                            c05 = l2Var.c0();
                        } else {
                            throw new ab.b(a.l("Invalid bitset value type: ", u0.c(c05), "; at path ", l2Var.h0(false)), 21);
                        }
                    } else {
                        int K2 = l2Var.K();
                        if (K2 != 0) {
                            if (K2 != 1) {
                                vd.a(K2, ", expected 0 or 1; at path ", l2Var.h0(true), "Invalid bitset value ");
                                return null;
                            }
                            bitSet.set(i18);
                            i18++;
                            c05 = l2Var.c0();
                        } else {
                            continue;
                            i18++;
                            c05 = l2Var.c0();
                        }
                    }
                }
                l2Var.W();
                return bitSet;
            case 22:
                int c06 = l2Var.c0();
                if (c06 == 9) {
                    l2Var.Y();
                    return null;
                }
                if (c06 == 6) {
                    return Boolean.valueOf(Boolean.parseBoolean(l2Var.O()));
                }
                return Boolean.valueOf(l2Var.b0());
            case 23:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                return Boolean.valueOf(l2Var.O());
            case 24:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                } else {
                    try {
                        int K3 = l2Var.K();
                        if (K3 <= 255 && K3 >= -128) {
                            return Byte.valueOf((byte) K3);
                        }
                        vd.a(K3, " to byte; at path ", l2Var.h0(true), "Lossy conversion from ");
                    } catch (NumberFormatException e15) {
                        throw new ab.b(21, e15);
                    }
                }
                return null;
            case 25:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                } else {
                    try {
                        int K4 = l2Var.K();
                        if (K4 <= 65535 && K4 >= -32768) {
                            return Short.valueOf((short) K4);
                        }
                        vd.a(K4, " to short; at path ", l2Var.h0(true), "Lossy conversion from ");
                    } catch (NumberFormatException e16) {
                        throw new ab.b(21, e16);
                    }
                }
                return null;
            case 26:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                try {
                    return Integer.valueOf(l2Var.K());
                } catch (NumberFormatException e17) {
                    throw new ab.b(21, e17);
                }
            case 27:
                try {
                    return new AtomicInteger(l2Var.K());
                } catch (NumberFormatException e18) {
                    throw new ab.b(21, e18);
                }
            default:
                return new AtomicBoolean(l2Var.b0());
        }
    }

    public String toString() {
        switch (this.f30489a) {
            case 3:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
