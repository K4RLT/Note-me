package u7;
import d.b;
import n6.a;
import c.b;
import c.c;
import g3.a;
import q.n;
import q.x;
import q0.d;
import u7.l2;
import u7.m6;
import u7.n6;
import u7.s6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.Matrix;
import android.util.Log;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.Scene;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.TransformManager;
import com.google.android.filament.android.TextureHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wa.b9;

/* loaded from: classes.dex */
public final class n6 {
    public Material i;

    /* renamed from: j, reason: collision with root package name */
    public TextureSampler f26622j;

    /* renamed from: k, reason: collision with root package name */
    public Texture f26623k;

    /* renamed from: l, reason: collision with root package name */
    public Context f26624l;

    /* renamed from: m, reason: collision with root package name */
    public Scene f26625m;

    /* renamed from: o, reason: collision with root package name */
    public int f26627o;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f26615a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f26616b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f26617c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f26618d = new HashMap();
    public final HashMap e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f26619f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f26620g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f26621h = new float[16];

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f26626n = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static float[] c(s6 s6Var, boolean z3) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float d2 = 0.75f - (b9.d(s6Var.f26865g, 0.0f, 1.0f) * 1.5f);
        float d10 = b9.d(s6Var.f26864f, 0.0f, 1.0f);
        String str = s6Var.e;
        switch (str.hashCode()) {
            case 3015911:
                if (str.equals("back")) {
                    Matrix.translateM(fArr, 0, 0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                    Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                Matrix.translateM(fArr, 0, -0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                break;
            case 3108285:
                if (str.equals("edge")) {
                    Matrix.translateM(fArr, 0, a.c(d10, 2.0f, 0.07f, -0.07f), d2, 1.0333999f);
                    break;
                }
                Matrix.translateM(fArr, 0, -0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                break;
            case 109645923:
                if (str.equals("spine")) {
                    Matrix.translateM(fArr, 0, a.c(d10, 2.0f, 0.07f, -0.07f), d2, 0.0f);
                    Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                Matrix.translateM(fArr, 0, -0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                break;
            case 109773344:
                if (str.equals("strap")) {
                    if (!z3) {
                        Matrix.translateM(fArr, 0, -0.087500006f, d2, 0.83140004f);
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                        break;
                    } else {
                        Matrix.translateM(fArr, 0, 0.089f, d2, 0.83140004f);
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                        break;
                    }
                }
                Matrix.translateM(fArr, 0, -0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                break;
            default:
                Matrix.translateM(fArr, 0, -0.07f, d2, (d10 * 1.01f) + 0.023399998f);
                Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                break;
        }
        float f10 = s6Var.f26866h;
        if (f10 != 0.0f) {
            Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        }
        float d11 = b9.d(s6Var.i, 0.05f, 20.0f);
        if (d11 == 1.0f) {
            return fArr;
        }
        Matrix.scaleM(fArr, 0, d11, d11, d11);
        return fArr;
    }

    public static long d(Context context, String str) {
        return new File(v7.b(context), a.k("meta_", str, ".txt")).lastModified();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.google.android.filament.VertexBuffer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, com.google.android.filament.IndexBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m6 a(com.google.android.filament.Engine r37, com.google.android.filament.Scene r38, com.google.android.filament.Material r39, com.google.android.filament.TextureSampler r40, com.google.android.filament.Texture r41, android.content.Context r42, java.lang.String r43, s6 r44) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.n6.a(com.google.android.filament.Engine, com.google.android.filament.Scene, com.google.android.filament.Material, com.google.android.filament.TextureSampler, com.google.android.filament.Texture, android.content.Context, java.lang.String, s6):m6");
    }

    public final void b(Engine engine, Scene scene) {
        engine.getClass();
        HashMap hashMap = this.f26619f;
        Collection values = hashMap.values();
        values.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            qe.n(arrayList, (Iterable) it.next());
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m6 m6Var = (m6) obj;
            if (scene != null) {
                scene.c(m6Var.f26567a);
            }
            engine.n(m6Var.f26567a);
            com.google.android.filament.b.f4241a.b(m6Var.f26567a);
        }
        hashMap.clear();
        this.f26626n.clear();
        HashMap hashMap2 = this.f26618d;
        Collection<l6> values2 = hashMap2.values();
        values2.getClass();
        for (l6 l6Var : values2) {
            engine.w(l6Var.f26495a);
            engine.p(l6Var.f26496b);
        }
        hashMap2.clear();
        HashMap hashMap3 = this.e;
        Collection values3 = hashMap3.values();
        values3.getClass();
        Iterator it2 = values3.iterator();
        while (it2.hasNext()) {
            engine.v((Texture) it2.next());
        }
        hashMap3.clear();
    }

    public final void e(TransformManager transformManager, m6 m6Var) {
        boolean z3 = m6Var.f26570d;
        int i = m6Var.f26567a;
        if (z3) {
            return;
        }
        int b10 = transformManager.b(i);
        if (b10 == 0) {
            transformManager.a(i);
            b10 = transformManager.b(i);
        }
        float[] fArr = this.f26621h;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 1000.0f, 0.0f, 0.0f);
        transformManager.d(b10, fArr);
        m6Var.f26570d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x025e, code lost:
    
        if (r10 >= (-500.0f)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0182, code lost:
    
        if (r1 >= (-500.0f)) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.filament.Engine r45, com.google.android.filament.TransformManager r46, java.util.List r47, int r48, l2 r49) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.n6.f(com.google.android.filament.Engine, com.google.android.filament.TransformManager, java.util.List, int, l2):void");
    }

    public final void g(Engine engine, Scene scene, Material material, TextureSampler textureSampler, Texture texture, Context context, ArrayList arrayList) {
        engine.getClass();
        scene.getClass();
        material.getClass();
        textureSampler.getClass();
        texture.getClass();
        context.getClass();
        this.i = material;
        this.f26622j = textureSampler;
        this.f26623k = texture;
        this.f26624l = context.getApplicationContext();
        this.f26625m = scene;
        HashMap hashMap = this.f26619f;
        Set keySet = hashMap.keySet();
        keySet.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (!arrayList.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        if (!arrayList2.isEmpty()) {
            engine.y();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                List<m6> list = (List) hashMap.remove((String) obj2);
                if (list != null) {
                    for (m6 m6Var : list) {
                        scene.c(m6Var.f26567a);
                        int i11 = m6Var.f26567a;
                        engine.n(i11);
                        com.google.android.filament.b.f4241a.b(i11);
                    }
                }
            }
        }
        this.f26626n.keySet().retainAll(qe.l.U(arrayList));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            String str = (String) obj3;
            if (!hashMap.containsKey(str)) {
                i(engine, str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.filament.Texture, java.lang.Object] */
    public final Texture h(Engine engine, File file, boolean z3) {
        Object kVar;
        long nCreateBuilder;
        int i;
        long nBuilderBuild;
        Texture texture;
        String str = file.getAbsolutePath() + "#" + file.length();
        HashMap hashMap = this.e;
        Texture texture2 = (Texture) hashMap.get(str);
        if (texture2 != null) {
            return texture2;
        }
        fg.s sVar = t6.f26895a;
        engine.getClass();
        try {
            kVar = BitmapFactory.decodeFile(file.getAbsolutePath());
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (kVar instanceof pe.k) {
            kVar = null;
        }
        Bitmap bitmap = (Bitmap) kVar;
        if (bitmap != null) {
            nCreateBuilder = Texture.nCreateBuilder();
            new b0.a(nCreateBuilder, 7);
            Texture.nBuilderWidth(nCreateBuilder, bitmap.getWidth());
            Texture.nBuilderHeight(nCreateBuilder, bitmap.getHeight());
            Texture.nBuilderLevels(nCreateBuilder, 1);
            Texture.nBuilderSampler(nCreateBuilder, 0);
            if (z3) {
                i = 32;
            } else {
                i = 31;
            }
            Texture.nBuilderFormat(nCreateBuilder, d.b(i));
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

    public final void i(Engine engine, String str) {
        Scene scene;
        Material material;
        TextureSampler textureSampler;
        Texture texture;
        Object kVar;
        Context context = this.f26624l;
        if (context != null && (scene = this.f26625m) != null && (material = this.i) != null && (textureSampler = this.f26622j) != null && (texture = this.f26623k) != null) {
            this.f26626n.put(str, Long.valueOf(d(context, str)));
            List<s6> list = v7.c(context, str).f27418o;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (s6 s6Var : list) {
                    Engine engine2 = engine;
                    String str2 = str;
                    try {
                        kVar = a(engine2, scene, material, textureSampler, texture, context, str2, s6Var);
                    } catch (Throwable th) {
                        kVar = new pe.k(th);
                    }
                    Throwable a10 = pe.a(kVar);
                    if (a10 != null) {
                        Log.w("Ornaments", str2 + "/" + s6Var.f26860a + ": " + a10.getMessage());
                    }
                    if (kVar instanceof pe.k) {
                        kVar = null;
                    }
                    m6 m6Var = (m6) kVar;
                    if (m6Var != null) {
                        arrayList.add(m6Var);
                    }
                    engine = engine2;
                    str = str2;
                }
                String str3 = str;
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f26619f.put(str3, arrayList);
            }
        }
    }
}