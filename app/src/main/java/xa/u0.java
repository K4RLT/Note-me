package xa;
import x.l;
import x.m;
import x.n;
import p.a;
import q.b;
import q.h;
import q.x;

import com.google.android.gms.internal.ads.wd0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a */
    public static final Type[] f30685a = new Type[0];

    public static Object A(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        x.n(g3.a.g(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static String E(String str, int i, int i10) {
        if (i < 0) {
            return e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        x.n(g3.a.g(i10, "negative size: "));
        return null;
    }

    public static void F(int i, Object obj, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static void H(Type type) {
        boolean z3 = true;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z3 = false;
        }
        k(z3);
    }

    public static boolean I(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return I(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type J(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return J(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (!cls2.isAssignableFrom(superclass)) {
                    cls = superclass;
                } else {
                    return J(cls.getGenericSuperclass(), superclass, cls2);
                }
            }
        }
        return cls2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013d, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013f, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0142, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013d A[EDGE_INSN: B:24:0x013d->B:25:0x013d BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [xa.q0] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [xa.t0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [xa.t0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [xa.r0] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v8, types: [xa.q0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type K(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.u0.K(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static /* bridge */ /* synthetic */ String L(char c10) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = c10;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i10 & 15);
            i++;
            i10 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static i1 M(int i, BitSet bitSet, String str) {
        int i10;
        if (i != 0) {
            if (i != 1) {
                int i11 = 2;
                if (i != 2) {
                    int length = bitSet.length();
                    if (i <= 1023 && length > i * 64) {
                        int cardinality = bitSet.cardinality();
                        boolean z3 = bitSet.get(0);
                        if (cardinality != 1) {
                            int highestOneBit = Integer.highestOneBit(cardinality - 1);
                            i11 = highestOneBit + highestOneBit;
                            while (i11 * 0.5d < cardinality) {
                                i11 += i11;
                            }
                        }
                        char[] cArr = new char[i11];
                        int i12 = i11 - 1;
                        int nextSetBit = bitSet.nextSetBit(0);
                        long j10 = 0;
                        while (nextSetBit != -1) {
                            long j11 = (1 << nextSetBit) | j10;
                            int rotateLeft = Integer.rotateLeft((-862048943) * nextSetBit, 15) * 461845907;
                            while (true) {
                                i10 = rotateLeft & i12;
                                if (cArr[i10] == 0) {
                                    break;
                                }
                                rotateLeft = i10 + 1;
                            }
                            cArr[i10] = (char) nextSetBit;
                            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
                            j10 = j11;
                        }
                        return new w2(cArr, j10, z3, str);
                    }
                    return new s0(bitSet, str);
                }
                char nextSetBit2 = (char) bitSet.nextSetBit(0);
                return new u1(nextSetBit2, (char) bitSet.nextSetBit(nextSetBit2 + 1), 1);
            }
            return new a2((char) bitSet.nextSetBit(0));
        }
        return v2.f30693c;
    }

    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static Class b(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            k(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return b(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        x.n(a.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", String.valueOf(type), "> is of type ", name));
        return null;
    }

    public static /* synthetic */ String c(int i) {
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
            default:
                return "END_DOCUMENT";
        }
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String e(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String h3;
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                h3 = "null";
            } else {
                try {
                    h3 = obj.toString();
                } catch (Exception e) {
                    String n10 = wd0.n(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(n10), (Throwable) e);
                    h3 = a5.a.h("<", n10, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i10] = h3;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i]);
            i++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static BigDecimal g(String str) {
        x(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void h(int i, int i10) {
        String e;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 < 0) {
                x.n(g3.a.g(i10, "negative size: "));
                return;
            }
            e = e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            e = e("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static void i(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void k(boolean z3) {
        if (z3) {
            return;
        }
        x.m();
    }

    public static int l(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a(hashCode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        F(r1, r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = l(r8)
            r1 = r0 & r10
            int r2 = u(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = java.util.Objects.equals(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = java.util.Objects.equals(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            F(r1, r11, r7)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.u0.m(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static String n(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String o(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static void q(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        x.l(E("index", i, i10));
    }

    public static void r(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            g5.h(a.k("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        g5.h("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static void s(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        g5.b();
    }

    public static int u(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Type v(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new q0(v(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new r0(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new q0(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new t0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void w(int i, int i10, int i11) {
        String E;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                E = e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                E = E("end index", i10, i11);
            }
        } else {
            E = E("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(E);
    }

    public static void x(String str) {
        if (str.length() <= 10000) {
        } else {
            throw new NumberFormatException(a.k("Number string too large: ", str.substring(0, 30), "..."));
        }
    }

    public boolean B(CharSequence charSequence) {
        if (D(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public abstract String[] C(Class cls);

    public int D(CharSequence charSequence) {
        return G(charSequence, 0);
    }

    public int G(CharSequence charSequence, int i) {
        int length = charSequence.length();
        q(i, length);
        while (i < length) {
            if (t(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract Constructor f(Class cls);

    public void j(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (t((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract Method p(Class cls, Field field);

    public abstract boolean t(char c10);

    public boolean y(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (t(charSequence.charAt(length)));
        return false;
    }

    public abstract boolean z(Class cls);
}
