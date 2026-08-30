package u7;
import b1.v;
import b1.y;
import f.a;
import f2.b;
import g3.a;
import o7.b;
import p7.e;
import q.d;
import q.x;
import r0.a1;
import r0.e0;
import r0.e1;
import r0.f1;
import u7.d6;
import v6.b;
import v6.d;
import v6.e;
import w0.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Choreographer;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d6 implements Choreographer.FrameCallback {
    public long B;
    public long C;
    public int D;
    public int E;
    public double F;
    public double G;
    public double H;
    public double I;
    public long J;
    public long K;
    public final /* synthetic */ a1 L;
    public final /* synthetic */ d M;
    public final /* synthetic */ d N;
    public final /* synthetic */ d O;
    public final /* synthetic */ d P;
    public final /* synthetic */ a1 Q;
    public final /* synthetic */ a1 R;
    public final /* synthetic */ a1 S;
    public final /* synthetic */ a1 T;
    public final /* synthetic */ d U;
    public final /* synthetic */ d V;
    public final /* synthetic */ d W;
    public final /* synthetic */ o1 X;
    public final /* synthetic */ m3 Y;
    public final /* synthetic */ a1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ y f26074a0;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ y f26075b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ y f26076c0;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ y f26077d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ a1 f26078e0;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ y8.c f26079f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ a1 f26080g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ Choreographer f26081h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ Context f26082i0;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ a1 f26083j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ a1 f26084k0;
    public final /* synthetic */ a1 l0;
    public final /* synthetic */ a1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ a1 f26085n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ a1 f26086o0;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ a1 f26087p0;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ a1 f26088q0;

    /* renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ e1 f26089r0;

    /* renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ HashMap f26090s0;

    /* renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ v f26091t0;

    /* renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ a1 f26093u0;

    /* renamed from: v0, reason: collision with root package name */
    public final /* synthetic */ f1 f26095v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26096w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26097x;

    /* renamed from: y, reason: collision with root package name */
    public int f26098y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26099z;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26092u = true;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f26094v = new float[16];
    public float A = Float.NaN;

    public d6(a1 a1Var, d dVar, d dVar2, d dVar3, d dVar4, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, d dVar5, d dVar6, d dVar7, o1 o1Var, m3 m3Var, a1 a1Var6, y yVar, y yVar2, y yVar3, y yVar4, a1 a1Var7, y8.c cVar, a1 a1Var8, Choreographer choreographer, Context context, a1 a1Var9, a1 a1Var10, a1 a1Var11, a1 a1Var12, a1 a1Var13, a1 a1Var14, a1 a1Var15, a1 a1Var16, e1 e1Var, HashMap hashMap, v vVar, a1 a1Var17, f1 f1Var) {
        this.L = a1Var;
        this.M = dVar;
        this.N = dVar2;
        this.O = dVar3;
        this.P = dVar4;
        this.Q = a1Var2;
        this.R = a1Var3;
        this.S = a1Var4;
        this.T = a1Var5;
        this.U = dVar5;
        this.V = dVar6;
        this.W = dVar7;
        this.X = o1Var;
        this.Y = m3Var;
        this.Z = a1Var6;
        this.f26074a0 = yVar;
        this.f26075b0 = yVar2;
        this.f26076c0 = yVar3;
        this.f26077d0 = yVar4;
        this.f26078e0 = a1Var7;
        this.f26079f0 = cVar;
        this.f26080g0 = a1Var8;
        this.f26081h0 = choreographer;
        this.f26082i0 = context;
        this.f26083j0 = a1Var9;
        this.f26084k0 = a1Var10;
        this.l0 = a1Var11;
        this.m0 = a1Var12;
        this.f26085n0 = a1Var13;
        this.f26086o0 = a1Var14;
        this.f26087p0 = a1Var15;
        this.f26088q0 = a1Var16;
        this.f26089r0 = e1Var;
        this.f26090s0 = hashMap;
        this.f26091t0 = vVar;
        this.f26093u0 = a1Var17;
        this.f26095v0 = f1Var;
    }

    public static final Texture a(a1 a1Var, m3 m3Var, Context context, Engine engine, int i, boolean z3) {
        String str;
        Texture texture;
        LinkedHashMap linkedHashMap = ((l2) a1Var.getValue()).F;
        String C0 = m3Var.C0(i);
        if (C0 == null) {
            C0 = a.g(i, "?");
        }
        pe.j jVar = new pe.j(C0, Boolean.valueOf(z3));
        int P = m3Var.P(i);
        pe.j jVar2 = (pe.j) linkedHashMap.get(jVar);
        if (jVar2 != null && ((Number) jVar2.f22693u).intValue() == P) {
            return (Texture) jVar2.f22694v;
        }
        v7.d d02 = m3Var.d0(context, i);
        String str2 = d02.f27410f;
        b bVar = (b) qe.l.y(i, m3Var.f26547u);
        if (bVar == null || (str = bVar.f21849b) == null) {
            str = "";
        }
        String N = m3Var.N(context, i);
        Bitmap b10 = b(((l2) a1Var.getValue()).f26478z, context, str2);
        Integer num = d02.e;
        if (num == null) {
            if (!str2.equals("none")) {
                num = Integer.valueOf(m3Var.v(i));
            } else {
                num = null;
            }
        }
        Integer num2 = num;
        Bitmap d2 = d(i, context, m3Var);
        try {
            texture = b(engine, d02, z3, str, N, b10, num2, d2, jVar2, context);
        } catch (OutOfMemoryError unused) {
            m3Var.L0(context);
            try {
                texture = b(engine, d02, z3, str, N, b10, num2, d2, jVar2, context);
            } catch (OutOfMemoryError e) {
                if (jVar2 != null) {
                    Texture texture2 = (Texture) jVar2.f22694v;
                    if (texture2 != null) {
                        texture = texture2;
                    } else {
                        throw e;
                    }
                } else {
                    throw e;
                }
            }
        }
        linkedHashMap.put(jVar, new pe.j(Integer.valueOf(P), texture));
        return texture;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.filament.Texture, java.lang.Object] */
    public static final Texture b(Engine engine, v7.d dVar, boolean z3, String str, String str2, Bitmap bitmap, Integer num, Bitmap bitmap2, pe.j jVar, Context context) {
        Typeface typeface;
        long nCreateBuilder;
        long nBuilderBuild;
        String str3 = dVar.f27406a;
        boolean z9 = dVar.f27407b;
        int i = dVar.f27408c;
        boolean z10 = dVar.f27409d;
        int i10 = dVar.f27411g;
        float f10 = dVar.f27412h;
        String str4 = dVar.f27415l;
        Texture texture = null;
        if (str4 != null) {
            typeface = e.e(context, str4);
        } else {
            typeface = null;
        }
        float f11 = dVar.i;
        float f12 = dVar.f27413j;
        float f13 = dVar.f27414k;
        if (jVar != null) {
            texture = (Texture) jVar.f22694v;
        }
        Texture texture2 = texture;
        Bitmap b10 = b(str3, z3, z9, i, str, z10, str2, bitmap, num, i10, f10, typeface, f11, f12, f13, bitmap2, 512, 768, true);
        new Canvas(b10);
        Texture texture3 = texture2;
        if (texture2 == null) {
            nCreateBuilder = Texture.nCreateBuilder();
            new b0.a(nCreateBuilder, 7);
            Texture.nBuilderWidth(nCreateBuilder, 512);
            Texture.nBuilderHeight(nCreateBuilder, 768);
            Texture.nBuilderLevels(nCreateBuilder, 1);
            Texture.nBuilderSampler(nCreateBuilder, 0);
            Texture.nBuilderFormat(nCreateBuilder, 31);
            nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                Object obj = new Object();
                obj.f4233a = nBuilderBuild;
                texture3 = obj;
            } else {
                x.o("Couldn't create Texture");
                return null;
            }
        }
        TextureHelper.a(engine, texture3, b10);
        b10.recycle();
        return texture3;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [com.google.android.filament.Texture, java.lang.Object] */
    public static final Texture c(a1 a1Var, Engine engine, Context context, m3 m3Var, int i) {
        Bitmap bitmap;
        long nCreateBuilder;
        long nBuilderBuild;
        Texture texture;
        l2 l2Var = (l2) a1Var.getValue();
        String str = m3Var.d0(context, i).f27410f;
        pe.n nVar = f2.f26168a;
        l2Var.getClass();
        HashSet hashSet = l2Var.B;
        HashMap hashMap = l2Var.A;
        str.getClass();
        String str2 = a(str).f26941d;
        if (str2 != null) {
            Texture texture2 = (Texture) hashMap.get(str);
            if (texture2 != null) {
                return texture2;
            }
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                pe.n nVar2 = v6.f26967a;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 1;
                    InputStream open = context.getAssets().open(str2);
                    try {
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        pa.a(open, null);
                    } finally {
                    }
                } catch (Exception unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    nCreateBuilder = Texture.nCreateBuilder();
                    new b0.a(nCreateBuilder, 7);
                    Texture.nBuilderWidth(nCreateBuilder, bitmap.getWidth());
                    Texture.nBuilderHeight(nCreateBuilder, bitmap.getHeight());
                    Texture.nBuilderLevels(nCreateBuilder, 1);
                    Texture.nBuilderSampler(nCreateBuilder, 0);
                    Texture.nBuilderFormat(nCreateBuilder, 30);
                    nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
                    if (nBuilderBuild != 0) {
                        Object obj = new Object();
                        obj.f4233a = nBuilderBuild;
                        TextureHelper.a(engine, obj, bitmap);
                        bitmap.recycle();
                        texture = obj;
                    } else {
                        x.o("Couldn't create Texture");
                        return null;
                    }
                } else {
                    texture = null;
                }
                if (texture == null) {
                    return null;
                }
                hashMap.put(str, texture);
                return texture;
            }
        }
        return null;
    }

    public static final String d(a1 a1Var, a1 a1Var2, a1 a1Var3) {
        float floatValue = ((Number) ((d) a1Var.getValue()).e()).floatValue();
        float floatValue2 = ((Number) ((d) a1Var2.getValue()).e()).floatValue();
        float floatValue3 = ((Number) ((d) a1Var3.getValue()).e()).floatValue();
        if (floatValue2 >= 1.0f) {
            return "lienzo";
        }
        if (floatValue2 > 0.02f) {
            return "a-lienzo";
        }
        if (floatValue > 0.9f) {
            return "galeria";
        }
        if (floatValue <= 0.02f && floatValue3 <= 0.02f) {
            return "libro";
        }
        return "abre/cierra";
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public static final Texture e(a1 a1Var, m3 m3Var, d6 d6Var, Engine engine, Context context, a1 a1Var2, int i, int i10) {
        int i11;
        l2 l2Var = (l2) a1Var.getValue();
        LinkedHashMap linkedHashMap = l2Var.N;
        if (i10 >= 2) {
            i11 = (i10 - 2) / 2;
        } else {
            i11 = 0;
        }
        String C0 = m3Var.C0(i);
        if (C0 == null) {
            C0 = a.g(i, "?");
        }
        pe.j jVar = new pe.j(C0, Integer.valueOf(i10));
        int l12 = m3Var.l1(i, i11);
        pe.j jVar2 = (pe.j) linkedHashMap.get(jVar);
        if (jVar2 != null && ((Number) jVar2.f22693u).intValue() == l12) {
            return (Texture) jVar2.f22694v;
        }
        if (jVar2 == null) {
            Texture texture = l2Var.f26470v;
            int i12 = d6Var.f26098y;
            if (i12 <= 0 && texture != null) {
                d6Var.f26099z = true;
                return texture;
            }
            d6Var.f26098y = i12 - 1;
            Object obj = new Object();
            obj.f19787u = e(engine, context, i, i10, m3Var, new e0(i, i10, l12, a1Var2, l2Var, jVar, obj));
            l2Var.O.put(jVar, Integer.valueOf(l12));
            linkedHashMap.put(jVar, new pe.j(Integer.valueOf(l12), obj.f19787u));
            return (Texture) obj.f19787u;
        }
        e.e(l2Var, engine, context, m3Var, i, i11);
        return (Texture) jVar2.f22694v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x020f A[LOOP:0: B:11:0x0206->B:13:0x020f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x023e A[LOOP:1: B:16:0x0235->B:18:0x023e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x11fa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1237  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026d A[LOOP:2: B:21:0x0264->B:23:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x14d2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x14da  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x151d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1575  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1592  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x15e3 A[LOOP:10: B:283:0x15dd->B:285:0x15e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x160c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x029c A[LOOP:3: B:26:0x0293->B:28:0x029c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1637  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1641  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1654  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x1659  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x17f0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x194c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1af2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x1cab  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1eff  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x21ad A[LOOP:13: B:458:0x1f00->B:464:0x21ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1f41 A[EDGE_INSN: B:465:0x1f41->B:547:0x1f41 BREAK  A[LOOP:13: B:458:0x1f00->B:464:0x21ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x21e1  */
    /* JADX WARN: Removed duplicated region for block: B:552:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1ec5  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x163c  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x15a9  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x1577  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x151f  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x14d4  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0d60  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x1073  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x10bb  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x10da  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x110c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:819:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0e71  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x21f7  */
    /* JADX WARN: Removed duplicated region for block: B:896:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:897:0x03c9  */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, com.google.android.filament.f] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r134) {
        /*
            Method dump skipped, instructions count: 8714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.d6.doFrame(long):void");
    }

    public final void f(long j10, long j11, boolean z3, String str) {
        double d2;
        double nanoTime = (System.nanoTime() - j10) / 1000000.0d;
        if (this.J != 0) {
            double d10 = (j11 - r7) / 1000000.0d;
            this.F += d10;
            if (d10 > this.G) {
                this.G = d10;
            }
        }
        this.J = j11;
        this.H += nanoTime;
        if (nanoTime > this.I) {
            this.I = nanoTime;
        }
        int i = 1;
        int i10 = this.D + 1;
        this.D = i10;
        if (z3) {
            this.E++;
        }
        if (this.K == 0) {
            this.K = j11;
        }
        if ((j11 - this.K) / 1000000.0d >= 400.0d && i10 >= 8) {
            l2 l2Var = (l2) this.L.getValue();
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(this.D);
            Integer valueOf2 = Integer.valueOf(this.E);
            double d11 = this.F;
            if (d11 > 0.0d) {
                d2 = ((this.D - 1) * 1000.0d) / d11;
            } else {
                d2 = 0.0d;
            }
            Double valueOf3 = Double.valueOf(d2);
            double d12 = this.F;
            int i11 = this.D - 1;
            if (i11 >= 1) {
                i = i11;
            }
            Log.d("PERF_DIAG", String.format(locale, "%-9s frames=%3d pintados=%3d | fps=%5.1f dt medio=%5.2f max=%6.2f | work medio=%5.2f max=%6.2f ms | mallas hoja=%3d caso=%3d | texturas=%2d", Arrays.copyOf(new Object[]{str, valueOf, valueOf2, valueOf3, Double.valueOf(d12 / i), Double.valueOf(this.G), Double.valueOf(this.H / this.D), Double.valueOf(this.I), Integer.valueOf(l2Var.R), Integer.valueOf(l2Var.S), Integer.valueOf(l2.P0)}, 11)));
            this.D = 0;
            this.E = 0;
            this.F = 0.0d;
            this.G = 0.0d;
            this.H = 0.0d;
            this.I = 0.0d;
            this.K = j11;
            l2Var.R = 0;
            l2Var.S = 0;
            l2.P0 = 0;
        }
    }
}