package lb;
import v.b;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.g21;
import com.google.android.gms.internal.ads.zb1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c7.a f20283d = new c7.a("ExtractorTaskFinder", 5);

    /* renamed from: a, reason: collision with root package name */
    public final t0 f20284a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20285b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f20286c;

    public u0(t0 t0Var, v vVar, c0 c0Var) {
        this.f20284a = t0Var;
        this.f20285b = vVar;
        this.f20286c = c0Var;
    }

    public final zb1 a() {
        c7.a aVar;
        zb1 zb1Var;
        zb1 zb1Var2;
        zb1 zb1Var3;
        c7.a aVar2;
        zb1 zb1Var4;
        c0 c0Var;
        zb1 zb1Var5;
        h1 h1Var;
        boolean z3;
        boolean z9;
        int i;
        v vVar = this.f20285b;
        t0 t0Var = this.f20284a;
        try {
            t0Var.f20282d.lock();
            ArrayList arrayList = new ArrayList();
            for (q0 q0Var : t0Var.f20281c.values()) {
                if (a.b(q0Var.f20236c.f6274b)) {
                    arrayList.add(q0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                HashMap o10 = vVar.o();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    aVar = f20283d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        q0 q0Var2 = (q0) obj;
                        g21 g21Var = q0Var2.f20236c;
                        Long l10 = (Long) o10.get((String) g21Var.f6276d);
                        if (l10 != null && g21Var.f6273a == l10.longValue()) {
                            aVar.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(q0Var2.f20234a), (String) g21Var.f6276d);
                            int i11 = q0Var2.f20234a;
                            String str = (String) g21Var.f6276d;
                            zb1Var = new j1(i11, (int) b(vVar.c(str), true), q0Var2.f20235b, g21Var.f6273a, str);
                            break;
                        }
                    } else {
                        zb1Var = null;
                        break;
                    }
                }
                if (zb1Var == null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            q0 q0Var3 = (q0) obj2;
                            try {
                                g21 g21Var2 = q0Var3.f20236c;
                                if (vVar.i((String) g21Var2.f6276d, g21Var2.f6273a, q0Var3.f20235b) == ((ArrayList) g21Var2.f6277f).size()) {
                                    aVar.a("Found final move task for session %s with pack %s.", Integer.valueOf(q0Var3.f20234a), (String) g21Var2.f6276d);
                                    zb1Var3 = new c1(q0Var3.f20234a, (String) g21Var2.f6276d, q0Var3.f20235b, g21Var2.f6273a, (String) g21Var2.e);
                                    break;
                                }
                            } catch (IOException e) {
                                throw new k0("Failed to check number of completed merges for session " + q0Var3.f20234a + ", pack " + ((String) q0Var3.f20236c.f6276d), e, q0Var3.f20234a);
                            }
                        } else {
                            zb1Var3 = null;
                            break;
                        }
                    }
                    if (zb1Var3 == null) {
                        int size3 = arrayList.size();
                        int i13 = 0;
                        loop3: while (true) {
                            if (i13 < size3) {
                                Object obj3 = arrayList.get(i13);
                                i13++;
                                q0 q0Var4 = (q0) obj3;
                                g21 g21Var3 = q0Var4.f20236c;
                                if (a.b(g21Var3.f6274b)) {
                                    ArrayList arrayList2 = (ArrayList) g21Var3.f6277f;
                                    int size4 = arrayList2.size();
                                    int i14 = 0;
                                    while (i14 < size4) {
                                        Object obj4 = arrayList2.get(i14);
                                        i14++;
                                        r0 r0Var = (r0) obj4;
                                        c7.a aVar3 = aVar;
                                        int i15 = size3;
                                        if (this.f20285b.m(q0Var4.f20235b, g21Var3.f6273a, (String) g21Var3.f6276d, r0Var.f20244a).exists()) {
                                            aVar2 = aVar3;
                                            aVar2.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(q0Var4.f20234a), (String) g21Var3.f6276d, r0Var.f20244a);
                                            zb1Var4 = new z0(q0Var4.f20234a, (String) g21Var3.f6276d, q0Var4.f20235b, g21Var3.f6273a, r0Var.f20244a);
                                            break loop3;
                                        }
                                        aVar = aVar3;
                                        size3 = i15;
                                    }
                                }
                            } else {
                                aVar2 = aVar;
                                zb1Var4 = null;
                                break;
                            }
                        }
                        if (zb1Var4 == null) {
                            int size5 = arrayList.size();
                            int i16 = 0;
                            loop5: while (true) {
                                if (i16 < size5) {
                                    Object obj5 = arrayList.get(i16);
                                    i16++;
                                    q0 q0Var5 = (q0) obj5;
                                    g21 g21Var4 = q0Var5.f20236c;
                                    if (a.b(g21Var4.f6274b)) {
                                        ArrayList arrayList3 = (ArrayList) g21Var4.f6277f;
                                        int size6 = arrayList3.size();
                                        int i17 = 0;
                                        while (i17 < size6) {
                                            Object obj6 = arrayList3.get(i17);
                                            i17++;
                                            r0 r0Var2 = (r0) obj6;
                                            if (b(q0Var5, r0Var2)) {
                                                ArrayList arrayList4 = arrayList3;
                                                int i18 = size6;
                                                int i19 = size5;
                                                if (this.f20285b.l(q0Var5.f20235b, g21Var4.f6273a, (String) g21Var4.f6276d, r0Var2.f20244a).exists()) {
                                                    aVar2.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(q0Var5.f20234a), (String) g21Var4.f6276d, r0Var2.f20244a);
                                                    zb1Var4 = new o1(q0Var5.f20234a, (String) g21Var4.f6276d, q0Var5.f20235b, g21Var4.f6273a, r0Var2.f20244a, r0Var2.f20245b);
                                                    break loop5;
                                                }
                                                arrayList3 = arrayList4;
                                                size6 = i18;
                                                size5 = i19;
                                            }
                                        }
                                    }
                                } else {
                                    zb1Var4 = null;
                                    break;
                                }
                            }
                            if (zb1Var4 == null) {
                                int size7 = arrayList.size();
                                int i20 = 0;
                                loop7: while (true) {
                                    int i21 = 2;
                                    c0Var = this.f20286c;
                                    if (i20 < size7) {
                                        int i22 = i20 + 1;
                                        q0 q0Var6 = (q0) arrayList.get(i20);
                                        g21 g21Var5 = q0Var6.f20236c;
                                        if (a.b(g21Var5.f6274b)) {
                                            ArrayList arrayList5 = (ArrayList) g21Var5.f6277f;
                                            int size8 = arrayList5.size();
                                            int i23 = 0;
                                            while (i23 < size8) {
                                                int i24 = i23 + 1;
                                                r0 r0Var3 = (r0) arrayList5.get(i23);
                                                int i25 = r0Var3.f20248f;
                                                if (i25 != 1 && i25 != i21) {
                                                    z9 = false;
                                                } else {
                                                    z9 = true;
                                                }
                                                String str2 = r0Var3.f20244a;
                                                ArrayList arrayList6 = r0Var3.f20247d;
                                                if (!z9) {
                                                    v vVar2 = this.f20285b;
                                                    g21 g21Var6 = q0Var6.f20236c;
                                                    int i26 = size7;
                                                    int i27 = i22;
                                                    ArrayList arrayList7 = arrayList5;
                                                    try {
                                                        i = new l1(vVar2, (String) g21Var6.f6276d, q0Var6.f20235b, g21Var6.f6273a, r0Var3.f20244a).a();
                                                    } catch (IOException e8) {
                                                        aVar2.c("Slice checkpoint corrupt, restarting extraction. %s", e8);
                                                        i = 0;
                                                    }
                                                    if (i != -1 && ((o0) arrayList6.get(i)).f20220a) {
                                                        aVar2.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(r0Var3.e), Integer.valueOf(q0Var6.f20234a), (String) q0Var6.f20236c.f6276d, str2, Integer.valueOf(i));
                                                        ParcelFileDescriptor.AutoCloseInputStream a10 = c0Var.a((String) q0Var6.f20236c.f6276d, q0Var6.f20234a, i, str2);
                                                        int i28 = q0Var6.f20234a;
                                                        g21 g21Var7 = q0Var6.f20236c;
                                                        String str3 = (String) g21Var7.f6276d;
                                                        int i29 = q0Var6.f20235b;
                                                        long j10 = g21Var7.f6273a;
                                                        String str4 = (String) g21Var7.e;
                                                        String str5 = r0Var3.f20244a;
                                                        int i30 = r0Var3.e;
                                                        int size9 = arrayList6.size();
                                                        g21 g21Var8 = q0Var6.f20236c;
                                                        zb1Var5 = new f0(i28, str3, i29, j10, str4, str5, i30, i, size9, g21Var8.f6275c, g21Var8.f6274b, a10);
                                                        break loop7;
                                                    }
                                                    i23 = i24;
                                                    size7 = i26;
                                                    i22 = i27;
                                                    arrayList5 = arrayList7;
                                                } else {
                                                    i23 = i24;
                                                }
                                                i21 = 2;
                                            }
                                        }
                                        i20 = i22;
                                    } else {
                                        zb1Var5 = null;
                                        break;
                                    }
                                }
                                if (zb1Var5 == null) {
                                    int size10 = arrayList.size();
                                    int i31 = 0;
                                    loop9: while (true) {
                                        if (i31 < size10) {
                                            Object obj7 = arrayList.get(i31);
                                            i31++;
                                            q0 q0Var7 = (q0) obj7;
                                            g21 g21Var9 = q0Var7.f20236c;
                                            if (a.b(g21Var9.f6274b)) {
                                                ArrayList arrayList8 = (ArrayList) g21Var9.f6277f;
                                                int size11 = arrayList8.size();
                                                int i32 = 0;
                                                while (i32 < size11) {
                                                    Object obj8 = arrayList8.get(i32);
                                                    i32++;
                                                    r0 r0Var4 = (r0) obj8;
                                                    int i33 = r0Var4.f20248f;
                                                    if (i33 != 1 && i33 != 2) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    String str6 = r0Var4.f20244a;
                                                    if (z3 && ((o0) r0Var4.f20247d.get(0)).f20220a && !b(q0Var7, r0Var4)) {
                                                        aVar2.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(r0Var4.f20248f), Integer.valueOf(q0Var7.f20234a), (String) q0Var7.f20236c.f6276d, str6);
                                                        ParcelFileDescriptor.AutoCloseInputStream a11 = c0Var.a((String) q0Var7.f20236c.f6276d, q0Var7.f20234a, 0, str6);
                                                        int i34 = q0Var7.f20234a;
                                                        String str7 = (String) q0Var7.f20236c.f6276d;
                                                        int b10 = (int) b(vVar.c(str7), true);
                                                        String str8 = (String) q0Var7.f20236c.f6276d;
                                                        h1Var = new h1(i34, str7, b10, b(new File(vVar.c(str8), String.valueOf((int) b(vVar.c(str8), true))), true), q0Var7.f20235b, q0Var7.f20236c.f6273a, r0Var4.f20248f, r0Var4.f20244a, r0Var4.f20246c, a11);
                                                        break loop9;
                                                    }
                                                }
                                            }
                                        } else {
                                            h1Var = null;
                                            break;
                                        }
                                    }
                                    if (h1Var != null) {
                                        t0Var.f20282d.unlock();
                                        return h1Var;
                                    }
                                } else {
                                    zb1Var2 = zb1Var5;
                                }
                            }
                        }
                        zb1Var2 = zb1Var4;
                    } else {
                        zb1Var2 = zb1Var3;
                    }
                } else {
                    zb1Var2 = zb1Var;
                }
                return zb1Var2;
            }
            zb1Var2 = null;
            return zb1Var2;
        } finally {
            t0Var.f20282d.unlock();
        }
    }

    public final boolean b(q0 q0Var, r0 r0Var) {
        g21 g21Var = q0Var.f20236c;
        String str = (String) g21Var.f6276d;
        long j10 = g21Var.f6273a;
        int i = q0Var.f20235b;
        String str2 = r0Var.f20244a;
        c7.a aVar = l1.f20192h;
        v vVar = this.f20285b;
        vVar.getClass();
        File file = new File(new File(new File(new File(vVar.d(str, j10, i), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    if (properties.getProperty("fileStatus") == null) {
                        aVar.c("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                        return false;
                    }
                    if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                        return true;
                    }
                } finally {
                }
            } catch (IOException e) {
                aVar.c("Could not read checkpoint while checking if extraction finished. %s", e);
                return false;
            }
        }
        return false;
    }
}
