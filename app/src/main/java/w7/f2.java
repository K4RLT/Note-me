package w7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28201u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l9 f28202v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28203w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f28204x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(kotlin.jvm.internal.y yVar, l9 l9Var, float f10, float f11, te.c cVar) {
        super(2, cVar);
        this.f28201u = yVar;
        this.f28202v = l9Var;
        this.f28203w = f10;
        this.f28204x = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new f2(this.f28201u, this.f28202v, this.f28203w, this.f28204x, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        pe.a.e(obj);
        p9 p9Var = p9.f28915a;
        Context context = (Context) this.f28201u.f19787u;
        l9 l9Var = this.f28202v;
        context.getClass();
        float f10 = this.f28203w;
        float f11 = this.f28204x;
        float f12 = f10 / f11;
        if (f12 < 0.01f) {
            f12 = 0.01f;
        }
        try {
            float d2 = wa.b9.d(f11, 48.0f, 512.0f);
            float f13 = f12 * d2;
            if (f13 > 4096.0f) {
                d2 *= 4096.0f / f13;
                f13 = 4096.0f;
            }
            int round = Math.round(f13);
            int i = 1;
            if (round < 1) {
                round = 1;
            }
            int round2 = Math.round(d2);
            if (round2 >= 1) {
                i = round2;
            }
            Bitmap createBitmap = Bitmap.createBitmap(round, i, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            p9.q(new Canvas(createBitmap), l9Var, round, i);
            File file = new File(context.getFilesDir(), "images");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "sticker_" + UUID.randomUUID() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                createBitmap.recycle();
                kVar = file2.getAbsolutePath();
            } finally {
            }
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (kVar instanceof pe.k) {
            kVar = null;
        }
        return (String) kVar;
    }
}
