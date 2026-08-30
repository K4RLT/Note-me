package eb;
import c3.q;
import c3.s;
import c3.u;
import c3.v;
import c3.x;
import q.g;
import q1.c;
import q1.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.y4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class m0 extends d3 {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f16233y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(h3 h3Var, int i) {
        super(h3Var);
        this.f16233y = i;
    }

    public static int B(com.google.android.gms.internal.measurement.g3 g3Var, String str) {
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).r1(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).d0(i).C())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle D(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            String E = c3Var.E();
            if (c3Var.H()) {
                bundle.putDouble(E, c3Var.p());
            } else if (c3Var.I()) {
                bundle.putFloat(E, c3Var.w());
            } else if (c3Var.L()) {
                bundle.putString(E, c3Var.F());
            } else if (c3Var.J()) {
                bundle.putLong(E, c3Var.B());
            }
        }
        return bundle;
    }

    public static Bundle E(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z3) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList2.add(E((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static com.google.android.gms.internal.measurement.c3 G(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        for (com.google.android.gms.internal.measurement.c3 c3Var : z2Var.E()) {
            if (c3Var.E().equals(str)) {
                return c3Var;
            }
        }
        return null;
    }

    public static a5 H(a5 a5Var, byte[] bArr) {
        v4 v4Var;
        v4 v4Var2 = v4.f13946a;
        if (v4Var2 == null) {
            synchronized (v4.class) {
                try {
                    v4Var = v4.f13946a;
                    if (v4Var == null) {
                        v4Var = y4.e();
                        v4.f13946a = v4Var;
                    }
                } finally {
                }
            }
            v4Var2 = v4Var;
        }
        if (v4Var2 != null) {
            a5Var.getClass();
            a5Var.c(bArr, bArr.length, v4Var2);
            return a5Var;
        }
        a5Var.getClass();
        a5Var.c(bArr, bArr.length, v4.f13947b);
        return a5Var;
    }

    public static u I(com.google.android.gms.internal.measurement.c cVar) {
        String str;
        Object obj;
        Bundle E = E(cVar.f13666c, true);
        if (E.containsKey("_o") && (obj = E.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String c10 = c(cVar.f13664a, e, q1.f16327g);
        if (c10 == null) {
            c10 = cVar.f13664a;
        }
        return new u(c10, new t(E), str2, cVar.f13665b);
    }

    public static String M(boolean z3, boolean z9, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append("Dynamic ");
        }
        if (z9) {
            sb2.append("Sequence ");
        }
        if (z10) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static ArrayList O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i << 6) + i10;
                if (i11 < bitSet.length()) {
                    if (bitSet.get(i11)) {
                        j10 |= 1 << i10;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(P(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(P(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(P(false, (android.os.Bundle) r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap P(boolean r10, android.os.Bundle r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r10 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = P(r6, r8)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = P(r6, r8)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = P(r6, r3)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.m0.P(boolean, android.os.Bundle):java.util.HashMap");
    }

    public static void R(int i, StringBuilder sb2) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
    }

    public static void S(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static void T(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                S(builder, str3, string, set);
            }
        }
    }

    public static void U(com.google.android.gms.internal.measurement.y2 y2Var, String str, Long l10) {
        List k3 = y2Var.k();
        int i = 0;
        while (true) {
            if (i < k3.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.c3) k3.get(i)).E())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.b3 D = com.google.android.gms.internal.measurement.c3.D();
        D.e(str);
        if (l10 != null) {
            D.d(l10.longValue());
        }
        if (i >= 0) {
            y2Var.b();
            com.google.android.gms.internal.measurement.z2.u((com.google.android.gms.internal.measurement.z2) y2Var.f13639v, i, (com.google.android.gms.internal.measurement.c3) D.a());
        } else {
            y2Var.d(D);
        }
    }

    public static void b0(StringBuilder sb2, int i, String str, com.google.android.gms.internal.measurement.v1 v1Var) {
        String str2;
        if (v1Var == null) {
            return;
        }
        R(i, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (v1Var.v()) {
            int p10 = v1Var.p();
            if (p10 != 1) {
                if (p10 != 2) {
                    if (p10 != 3) {
                        if (p10 != 4) {
                            if (p10 == 5) {
                                str2 = "BETWEEN";
                            } else {
                                throw null;
                            }
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            c0(sb2, i, "comparison_type", str2);
        }
        if (v1Var.x()) {
            c0(sb2, i, "match_as_float", Boolean.valueOf(v1Var.u()));
        }
        if (v1Var.w()) {
            c0(sb2, i, "comparison_value", v1Var.r());
        }
        if (v1Var.z()) {
            c0(sb2, i, "min_comparison_value", v1Var.t());
        }
        if (v1Var.y()) {
            c0(sb2, i, "max_comparison_value", v1Var.s());
        }
        R(i, sb2);
        sb2.append("}\n");
    }

    public static void c0(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        R(i + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static void d0(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.k3 k3Var) {
        Integer num;
        Integer num2;
        Long l10;
        if (k3Var == null) {
            return;
        }
        R(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (k3Var.s() != 0) {
            R(4, sb2);
            sb2.append("results: ");
            int i = 0;
            for (Long l11 : k3Var.E()) {
                int i10 = i + 1;
                if (i != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i = i10;
            }
            sb2.append('\n');
        }
        if (k3Var.y() != 0) {
            R(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l12 : k3Var.G()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (k3Var.p() != 0) {
            R(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.x2 x2Var : k3Var.D()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                if (x2Var.v()) {
                    num2 = Integer.valueOf(x2Var.p());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (x2Var.u()) {
                    l10 = Long.valueOf(x2Var.s());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (k3Var.v() != 0) {
            R(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.m3 m3Var : k3Var.F()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                if (m3Var.w()) {
                    num = Integer.valueOf(m3Var.t());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = m3Var.v().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        R(3, sb2);
        sb2.append("}\n");
    }

    public static boolean f0(f5 f5Var, int i) {
        if (i < (f5Var.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) f5Var.get(i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static byte[] g0(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable h0(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        com.google.android.gms.internal.measurement.c3 G = G(z2Var, str);
        if (G != null) {
            if (G.L()) {
                return G.F();
            }
            if (G.J()) {
                return Long.valueOf(G.B());
            }
            if (G.H()) {
                return Double.valueOf(G.p());
            }
            if (G.z() > 0) {
                List<com.google.android.gms.internal.measurement.c3> G2 = G.G();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.c3 c3Var : G2) {
                    if (c3Var != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.c3 c3Var2 : c3Var.G()) {
                            if (c3Var2.L()) {
                                bundle.putString(c3Var2.E(), c3Var2.F());
                            } else if (c3Var2.J()) {
                                bundle.putLong(c3Var2.E(), c3Var2.B());
                            } else if (c3Var2.H()) {
                                bundle.putDouble(c3Var2.E(), c3Var2.p());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static boolean i0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    @Override // eb.d3
    public final boolean A() {
        switch (this.f16233y) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public long C(byte[] bArr) {
        fa.y.h(bArr);
        t().u();
        MessageDigest J0 = l3.J0();
        if (J0 == null) {
            f().A.g("Failed to get MD5");
            return 0L;
        }
        return l3.C(J0.digest(bArr));
    }

    public Parcelable F(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (ga.b unused) {
            f().A.g("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public b3 J(String str, com.google.android.gms.internal.measurement.g3 g3Var, com.google.android.gms.internal.measurement.y2 y2Var, String str2) {
        int indexOf;
        v7.a();
        d1 d1Var = (d1) this.f3443v;
        e eVar = d1Var.A;
        e eVar2 = d1Var.A;
        if (!eVar.F(str, v.f16434y0)) {
            return null;
        }
        d1Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String[] split = eVar2.C(str, v.f16397e0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                g5.g(str3, "duplicate element: ");
                return null;
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f3 f3Var = this.f16125w.D;
        u0 x9 = f3Var.x();
        d1 d1Var2 = (d1) f3Var.f3443v;
        x9.u();
        x9.U(str);
        String str4 = (String) x9.G.get(str);
        Uri.Builder builder = new Uri.Builder();
        e eVar3 = d1Var2.A;
        e eVar4 = d1Var2.A;
        builder.scheme(eVar3.C(str, v.X));
        if (!TextUtils.isEmpty(str4)) {
            builder.authority(str4 + "." + eVar4.C(str, v.Y));
        } else {
            builder.authority(eVar4.C(str, v.Y));
        }
        builder.path(eVar4.C(str, v.Z));
        S(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).L(), unmodifiableSet);
        S(builder, "gmp_version", "97001", unmodifiableSet);
        String C = ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).C();
        c0 c0Var = v.B0;
        if (eVar2.F(str, c0Var) && x().S(str)) {
            C = "";
        }
        S(builder, "app_instance_id", C, unmodifiableSet);
        S(builder, "rdid", ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).P(), unmodifiableSet);
        S(builder, "bundle_id", g3Var.T(), unmodifiableSet);
        String j10 = y2Var.j();
        String c10 = c(j10, q1.f16327g, e);
        if (!TextUtils.isEmpty(c10)) {
            j10 = c10;
        }
        S(builder, "app_event_name", j10, unmodifiableSet);
        S(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).c0()), unmodifiableSet);
        String N = ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).N();
        if (eVar2.F(str, c0Var) && x().T(str) && !TextUtils.isEmpty(N) && (indexOf = N.indexOf(".")) != -1) {
            N = N.substring(0, indexOf);
        }
        S(builder, "os_version", N, unmodifiableSet);
        S(builder, "timestamp", String.valueOf(y2Var.i()), unmodifiableSet);
        String str5 = "1";
        if (((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).X()) {
            S(builder, "lat", "1", unmodifiableSet);
        }
        S(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).p()), unmodifiableSet);
        S(builder, "trigger_uri_source", "1", unmodifiableSet);
        S(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        S(builder, "request_uuid", str2, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.c3> k3 = y2Var.k();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.c3 c3Var : k3) {
            String E = c3Var.E();
            if (c3Var.H()) {
                bundle.putString(E, String.valueOf(c3Var.p()));
            } else if (c3Var.I()) {
                bundle.putString(E, String.valueOf(c3Var.w()));
            } else if (c3Var.L()) {
                bundle.putString(E, c3Var.F());
            } else if (c3Var.J()) {
                bundle.putString(E, String.valueOf(c3Var.B()));
            }
        }
        T(builder, eVar2.C(str, v.f16396d0).split("\\|"), bundle, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.o3> unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).U());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.o3 o3Var : unmodifiableList) {
            String C2 = o3Var.C();
            if (o3Var.E()) {
                bundle2.putString(C2, String.valueOf(o3Var.p()));
            } else if (o3Var.F()) {
                bundle2.putString(C2, String.valueOf(o3Var.u()));
            } else if (o3Var.I()) {
                bundle2.putString(C2, o3Var.D());
            } else if (o3Var.G()) {
                bundle2.putString(C2, String.valueOf(o3Var.y()));
            }
        }
        T(builder, eVar2.C(str, v.f16394c0).split("\\|"), bundle2, unmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).W()) {
            str5 = "0";
        }
        S(builder, "dma", str5, unmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).H().isEmpty()) {
            S(builder, "dma_cps", ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).H(), unmodifiableSet);
        }
        if (eVar2.F(null, v.D0) && ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).Z()) {
            com.google.android.gms.internal.measurement.q2 X1 = ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).X1();
            if (!X1.J().isEmpty()) {
                S(builder, "dl_gclid", X1.J(), unmodifiableSet);
            }
            if (!X1.I().isEmpty()) {
                S(builder, "dl_gbraid", X1.I(), unmodifiableSet);
            }
            if (!X1.F().isEmpty()) {
                S(builder, "dl_gs", X1.F(), unmodifiableSet);
            }
            if (X1.p() > 0) {
                S(builder, "dl_ss_ts", String.valueOf(X1.p()), unmodifiableSet);
            }
            if (!X1.M().isEmpty()) {
                S(builder, "mr_gclid", X1.M(), unmodifiableSet);
            }
            if (!X1.L().isEmpty()) {
                S(builder, "mr_gbraid", X1.L(), unmodifiableSet);
            }
            if (!X1.K().isEmpty()) {
                S(builder, "mr_gs", X1.K(), unmodifiableSet);
            }
            if (X1.t() > 0) {
                S(builder, "mr_click_ts", String.valueOf(X1.t()), unmodifiableSet);
            }
        }
        return new b3(builder.build().toString(), currentTimeMillis, 1);
    }

    public String L(com.google.android.gms.internal.measurement.f3 f3Var) {
        Long l10;
        Long l11;
        Double d2;
        com.google.android.gms.internal.measurement.t2 Y1;
        d1 d1Var = (d1) this.f3443v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        a8.a();
        e eVar = d1Var.A;
        h0 h0Var = d1Var.G;
        e eVar2 = d1Var.A;
        if (eVar.F(null, v.f16420r0) && f3Var.p() > 0) {
            t();
            if (l3.A0(f3Var.q().b2()) && f3Var.w()) {
                c0(sb2, 0, "UploadSubdomain", f3Var.u());
            }
        }
        for (com.google.android.gms.internal.measurement.h3 h3Var : f3Var.v()) {
            if (h3Var != null) {
                R(1, sb2);
                sb2.append("bundle {\n");
                if (h3Var.y0()) {
                    c0(sb2, 1, "protocol_version", Integer.valueOf(h3Var.c1()));
                }
                w7.f13961v.get();
                if (eVar2.F(h3Var.b2(), v.f16418q0) && h3Var.B0()) {
                    c0(sb2, 1, "session_stitching_token", h3Var.Q());
                }
                c0(sb2, 1, "platform", h3Var.O());
                if (h3Var.t0()) {
                    c0(sb2, 1, "gmp_version", Long.valueOf(h3Var.K1()));
                }
                if (h3Var.G0()) {
                    c0(sb2, 1, "uploading_gmp_version", Long.valueOf(h3Var.W1()));
                }
                if (h3Var.r0()) {
                    c0(sb2, 1, "dynamite_version", Long.valueOf(h3Var.E1()));
                }
                if (h3Var.l0()) {
                    c0(sb2, 1, "config_version", Long.valueOf(h3Var.w1()));
                }
                c0(sb2, 1, "gmp_app_id", h3Var.L());
                c0(sb2, 1, "admob_app_id", h3Var.a2());
                c0(sb2, 1, "app_id", h3Var.b2());
                c0(sb2, 1, "app_version", h3Var.E());
                if (h3Var.a0()) {
                    c0(sb2, 1, "app_version_major", Integer.valueOf(h3Var.c0()));
                }
                c0(sb2, 1, "firebase_instance_id", h3Var.K());
                if (h3Var.q0()) {
                    c0(sb2, 1, "dev_cert_hash", Long.valueOf(h3Var.A1()));
                }
                c0(sb2, 1, "app_store", h3Var.D());
                if (h3Var.F0()) {
                    c0(sb2, 1, "upload_timestamp_millis", Long.valueOf(h3Var.U1()));
                }
                if (h3Var.C0()) {
                    c0(sb2, 1, "start_timestamp_millis", Long.valueOf(h3Var.Q1()));
                }
                if (h3Var.s0()) {
                    c0(sb2, 1, "end_timestamp_millis", Long.valueOf(h3Var.I1()));
                }
                if (h3Var.x0()) {
                    c0(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(h3Var.O1()));
                }
                if (h3Var.w0()) {
                    c0(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(h3Var.M1()));
                }
                c0(sb2, 1, "app_instance_id", h3Var.C());
                c0(sb2, 1, "resettable_device_id", h3Var.P());
                c0(sb2, 1, "ds_id", h3Var.J());
                if (h3Var.v0()) {
                    c0(sb2, 1, "limited_ad_tracking", Boolean.valueOf(h3Var.X()));
                }
                c0(sb2, 1, "os_version", h3Var.N());
                c0(sb2, 1, "device_model", h3Var.I());
                c0(sb2, 1, "user_default_language", h3Var.R());
                if (h3Var.E0()) {
                    c0(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(h3Var.m1()));
                }
                if (h3Var.k0()) {
                    c0(sb2, 1, "bundle_sequential_index", Integer.valueOf(h3Var.H0()));
                }
                a8.a();
                t();
                if (l3.A0(h3Var.b2()) && eVar2.F(null, v.f16420r0) && h3Var.p0()) {
                    c0(sb2, 1, "delivery_index", Integer.valueOf(h3Var.O0()));
                }
                if (h3Var.A0()) {
                    c0(sb2, 1, "service_upload", Boolean.valueOf(h3Var.Y()));
                }
                c0(sb2, 1, "health_monitor", h3Var.M());
                if (h3Var.z0()) {
                    c0(sb2, 1, "retry_counter", Integer.valueOf(h3Var.h1()));
                }
                if (h3Var.n0()) {
                    c0(sb2, 1, "consent_signals", h3Var.G());
                }
                if (h3Var.u0()) {
                    c0(sb2, 1, "is_dma_region", Boolean.valueOf(h3Var.W()));
                }
                if (h3Var.o0()) {
                    c0(sb2, 1, "core_platform_services", h3Var.H());
                }
                if (h3Var.m0()) {
                    c0(sb2, 1, "consent_diagnostics", h3Var.F());
                }
                if (h3Var.D0()) {
                    c0(sb2, 1, "target_os_version", Long.valueOf(h3Var.S1()));
                }
                v7.a();
                if (eVar2.F(h3Var.b2(), v.f16434y0)) {
                    c0(sb2, 1, "ad_services_version", Integer.valueOf(h3Var.p()));
                    if (h3Var.b0() && (Y1 = h3Var.Y1()) != null) {
                        R(2, sb2);
                        sb2.append("attribution_eligibility_status {\n");
                        c0(sb2, 2, "eligible", Boolean.valueOf(Y1.z()));
                        c0(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(Y1.C()));
                        c0(sb2, 2, "pre_r", Boolean.valueOf(Y1.D()));
                        c0(sb2, 2, "r_extensions_too_old", Boolean.valueOf(Y1.E()));
                        c0(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(Y1.x()));
                        c0(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(Y1.v()));
                        c0(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(Y1.B()));
                        R(2, sb2);
                        sb2.append("}\n");
                    }
                }
                g7.a();
                if (eVar2.F(null, v.L0) && h3Var.Z()) {
                    c0(sb2, 1, "ad_campaign_info", h3Var.X1());
                }
                i5<com.google.android.gms.internal.measurement.o3> U = h3Var.U();
                if (U != null) {
                    for (com.google.android.gms.internal.measurement.o3 o3Var : U) {
                        if (o3Var != null) {
                            R(2, sb2);
                            sb2.append("user_property {\n");
                            if (o3Var.H()) {
                                l10 = Long.valueOf(o3Var.A());
                            } else {
                                l10 = null;
                            }
                            c0(sb2, 2, "set_timestamp_millis", l10);
                            c0(sb2, 2, "name", h0Var.g(o3Var.C()));
                            c0(sb2, 2, "string_value", o3Var.D());
                            if (o3Var.G()) {
                                l11 = Long.valueOf(o3Var.y());
                            } else {
                                l11 = null;
                            }
                            c0(sb2, 2, "int_value", l11);
                            if (o3Var.E()) {
                                d2 = Double.valueOf(o3Var.p());
                            } else {
                                d2 = null;
                            }
                            c0(sb2, 2, "double_value", d2);
                            R(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                i5<com.google.android.gms.internal.measurement.v2> S = h3Var.S();
                if (S != null) {
                    for (com.google.android.gms.internal.measurement.v2 v2Var : S) {
                        if (v2Var != null) {
                            R(2, sb2);
                            sb2.append("audience_membership {\n");
                            if (v2Var.y()) {
                                c0(sb2, 2, "audience_id", Integer.valueOf(v2Var.p()));
                            }
                            if (v2Var.z()) {
                                c0(sb2, 2, "new_audience", Boolean.valueOf(v2Var.x()));
                            }
                            d0(sb2, "current_data", v2Var.v());
                            if (v2Var.A()) {
                                d0(sb2, "previous_data", v2Var.w());
                            }
                            R(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                i5<com.google.android.gms.internal.measurement.z2> T = h3Var.T();
                if (T != null) {
                    for (com.google.android.gms.internal.measurement.z2 z2Var : T) {
                        if (z2Var != null) {
                            R(2, sb2);
                            sb2.append("event {\n");
                            c0(sb2, 2, "name", h0Var.c(z2Var.D()));
                            if (z2Var.H()) {
                                c0(sb2, 2, "timestamp_millis", Long.valueOf(z2Var.B()));
                            }
                            if (z2Var.G()) {
                                c0(sb2, 2, "previous_timestamp_millis", Long.valueOf(z2Var.A()));
                            }
                            if (z2Var.F()) {
                                c0(sb2, 2, "count", Integer.valueOf(z2Var.p()));
                            }
                            if (z2Var.y() != 0) {
                                a0(sb2, 2, z2Var.E());
                            }
                            R(2, sb2);
                            sb2.append("}\n");
                        }
                    }
                }
                R(1, sb2);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public List Q(f5 f5Var, List list) {
        int i;
        ArrayList arrayList = new ArrayList(f5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                f().D.f(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    f().D.h("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public void V(com.google.android.gms.internal.measurement.b3 b3Var, Object obj) {
        b3Var.b();
        com.google.android.gms.internal.measurement.v((com.google.android.gms.internal.measurement.c3) b3Var.f13639v);
        b3Var.b();
        com.google.android.gms.internal.measurement.x((com.google.android.gms.internal.measurement.c3) b3Var.f13639v);
        b3Var.b();
        com.google.android.gms.internal.measurement.c3.A((com.google.android.gms.internal.measurement.c3) b3Var.f13639v);
        b3Var.b();
        com.google.android.gms.internal.measurement.c3.C((com.google.android.gms.internal.measurement.c3) b3Var.f13639v);
        if (obj instanceof String) {
            b3Var.f((String) obj);
            return;
        }
        if (obj instanceof Long) {
            b3Var.d(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            b3Var.b();
            com.google.android.gms.internal.measurement.q((com.google.android.gms.internal.measurement.c3) b3Var.f13639v, doubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.b3 D = com.google.android.gms.internal.measurement.c3.D();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.b3 D2 = com.google.android.gms.internal.measurement.c3.D();
                        D2.e(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            D2.d(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            D2.f((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            D2.b();
                            com.google.android.gms.internal.measurement.q((com.google.android.gms.internal.measurement.c3) D2.f13639v, doubleValue2);
                        }
                        D.b();
                        com.google.android.gms.internal.measurement.s((com.google.android.gms.internal.measurement.c3) D.f13639v, (com.google.android.gms.internal.measurement.c3) D2.a());
                    }
                    if (((com.google.android.gms.internal.measurement.c3) D.f13639v).z() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.c3) D.a());
                    }
                }
            }
            b3Var.b();
            com.google.android.gms.internal.measurement.u((com.google.android.gms.internal.measurement.c3) b3Var.f13639v, arrayList);
            return;
        }
        f().A.f(obj, "Ignoring invalid (type) event param value");
    }

    public void X(com.google.android.gms.internal.measurement.g3 g3Var) {
        f().I.g("Checking account type status for ad personalization signals");
        if (k0(g3Var.T())) {
            f().H.g("Turning off ad personalization due to account type");
            com.google.android.gms.internal.measurement.n3 B = com.google.android.gms.internal.measurement.o3.B();
            B.b();
            com.google.android.gms.internal.measurement.o3.s((com.google.android.gms.internal.measurement.o3) B.f13639v, "_npa");
            n l10 = ((d1) this.f3443v).l();
            l10.u();
            long j10 = l10.B;
            B.b();
            com.google.android.gms.internal.measurement.o3.r((com.google.android.gms.internal.measurement.o3) B.f13639v, j10);
            B.b();
            com.google.android.gms.internal.measurement.o3.w((com.google.android.gms.internal.measurement.o3) B.f13639v, 1L);
            com.google.android.gms.internal.measurement.o3 o3Var = (com.google.android.gms.internal.measurement.o3) B.a();
            int i = 0;
            while (true) {
                if (i < ((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).r1()) {
                    if ("_npa".equals(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).d0(i).C())) {
                        g3Var.b();
                        com.google.android.gms.internal.measurement.h3.t((com.google.android.gms.internal.measurement.h3) g3Var.f13639v, i, o3Var);
                        break;
                    }
                    i++;
                } else {
                    g3Var.b();
                    com.google.android.gms.internal.measurement.h3.y((com.google.android.gms.internal.measurement.h3) g3Var.f13639v, o3Var);
                    break;
                }
            }
            z5.h r8 = z5.h.r(((com.google.android.gms.internal.measurement.h3) g3Var.f13639v).F());
            r8.v(n1.AD_PERSONALIZATION, h.CHILD_ACCOUNT);
            String hVar = r8.toString();
            g3Var.b();
            com.google.android.gms.internal.measurement.h3.g1((com.google.android.gms.internal.measurement.h3) g3Var.f13639v, hVar);
        }
    }

    public void Y(com.google.android.gms.internal.measurement.n3 n3Var, Object obj) {
        fa.y.h(obj);
        n3Var.b();
        com.google.android.gms.internal.measurement.o3.t((com.google.android.gms.internal.measurement.o3) n3Var.f13639v);
        n3Var.b();
        com.google.android.gms.internal.measurement.o3.v((com.google.android.gms.internal.measurement.o3) n3Var.f13639v);
        n3Var.b();
        com.google.android.gms.internal.measurement.o3.z((com.google.android.gms.internal.measurement.o3) n3Var.f13639v);
        if (obj instanceof String) {
            n3Var.b();
            com.google.android.gms.internal.measurement.o3.x((com.google.android.gms.internal.measurement.o3) n3Var.f13639v, (String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            n3Var.b();
            com.google.android.gms.internal.measurement.o3.w((com.google.android.gms.internal.measurement.o3) n3Var.f13639v, longValue);
        } else {
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                n3Var.b();
                com.google.android.gms.internal.measurement.o3.q((com.google.android.gms.internal.measurement.o3) n3Var.f13639v, doubleValue);
                return;
            }
            f().A.f(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void Z(StringBuilder sb2, int i, com.google.android.gms.internal.measurement.t1 t1Var) {
        String str;
        if (t1Var == null) {
            return;
        }
        R(i, sb2);
        sb2.append("filter {\n");
        if (t1Var.v()) {
            c0(sb2, i, "complement", Boolean.valueOf(t1Var.u()));
        }
        if (t1Var.x()) {
            c0(sb2, i, "param_name", ((d1) this.f3443v).G.f(t1Var.t()));
        }
        if (t1Var.y()) {
            int i10 = i + 1;
            com.google.android.gms.internal.measurement.y1 s10 = t1Var.s();
            if (s10 != null) {
                R(i10, sb2);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (s10.x()) {
                    switch (s10.q()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        case 7:
                            str = "IN_LIST";
                            break;
                        default:
                            throw null;
                    }
                    c0(sb2, i10, "match_type", str);
                }
                if (s10.w()) {
                    c0(sb2, i10, "expression", s10.s());
                }
                if (s10.v()) {
                    c0(sb2, i10, "case_sensitive", Boolean.valueOf(s10.u()));
                }
                if (s10.p() > 0) {
                    R(i + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : s10.t()) {
                        R(i + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                R(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (t1Var.w()) {
            b0(sb2, i + 1, "number_filter", t1Var.r());
        }
        R(i, sb2);
        sb2.append("}\n");
    }

    public void a0(StringBuilder sb2, int i, i5 i5Var) {
        String str;
        String str2;
        Long l10;
        if (i5Var != null) {
            int i10 = i + 1;
            Iterator it = i5Var.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
                if (c3Var != null) {
                    R(i10, sb2);
                    sb2.append("param {\n");
                    Double d2 = null;
                    if (c3Var.K()) {
                        str = ((d1) this.f3443v).G.f(c3Var.E());
                    } else {
                        str = null;
                    }
                    c0(sb2, i10, "name", str);
                    if (c3Var.L()) {
                        str2 = c3Var.F();
                    } else {
                        str2 = null;
                    }
                    c0(sb2, i10, "string_value", str2);
                    if (c3Var.J()) {
                        l10 = Long.valueOf(c3Var.B());
                    } else {
                        l10 = null;
                    }
                    c0(sb2, i10, "int_value", l10);
                    if (c3Var.H()) {
                        d2 = Double.valueOf(c3Var.p());
                    }
                    c0(sb2, i10, "double_value", d2);
                    if (c3Var.z() > 0) {
                        a0(sb2, i10, (i5) c3Var.G());
                    }
                    R(i10, sb2);
                    sb2.append("}\n");
                }
            }
        }
    }

    public boolean e0(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            ((d1) this.f3443v).H.getClass();
            if (Math.abs(System.currentTimeMillis() - j10) <= j11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public byte[] j0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            f().A.f(e, "Failed to gzip content");
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.m0.k0(java.lang.String):boolean");
    }

    public byte[] l0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            f().A.f(e, "Failed to ungzip content");
            throw e;
        }
    }

    public ArrayList m0() {
        Map b10;
        Context context = this.f16125w.F.f16102u;
        List list = v.f16389a;
        b4 a10 = b4.a(context.getContentResolver(), h4.a("com.google.android.gms.measurement"), new c4.o(2));
        if (a10 == null) {
            b10 = Collections.EMPTY_MAP;
        } else {
            b10 = a10.b();
        }
        if (b10 != null && !b10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int intValue = ((Integer) v.P.a(null)).intValue();
            for (Map.Entry entry : b10.entrySet()) {
                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                    try {
                        int parseInt = Integer.parseInt((String) entry.getValue());
                        if (parseInt != 0) {
                            arrayList.add(Integer.valueOf(parseInt));
                            if (arrayList.size() >= intValue) {
                                f().D.f(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        f().D.f(e, "Experiment ID NumberFormatException");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    public boolean n0() {
        y();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((d1) this.f3443v).f16102u.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
