package v7;
import c.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import b2.f1;
import df.p;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import pf.z;
import q.x;
import u7.a1;
import u7.c1;

/* loaded from: classes.dex */
public final class b extends ve.i implements p {
    public final /* synthetic */ int A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27398u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f27399v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f27400w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f27401x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f1 f27402y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f27403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, f1 f1Var, String str2, int i, te.c cVar) {
        super(2, cVar);
        this.f27400w = context;
        this.f27401x = str;
        this.f27402y = f1Var;
        this.f27403z = str2;
        this.A = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27398u) {
            case 0:
                return new b(this.f27401x, this.f27402y, this.f27400w, this.f27403z, this.A, cVar);
            default:
                return new b(this.f27400w, this.f27401x, this.f27402y, this.f27403z, this.A, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27398u) {
            case 0:
                return ((b) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((b) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f27398u;
        int i10 = 1536;
        int i11 = 1024;
        String str = this.f27403z;
        f1 f1Var = this.f27402y;
        String str2 = this.f27401x;
        ue.a aVar = ue.a.f27192u;
        Context context = this.f27400w;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = null;
        Integer num = null;
        switch (i) {
            case 0:
                int i12 = this.f27399v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    List list = c1.f25989a;
                    Iterator it = c1.f25989a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((a1) next).f25888a.equals(str2)) {
                                obj2 = next;
                            }
                        }
                    }
                    a1 a1Var = (a1) obj2;
                    if (a1Var != null) {
                        f1Var.getClass();
                        File file = new File(f1.h(context), p.a.k("cover_", str, ".jpg"));
                        try {
                            Bitmap a10 = c1.a(a1Var, 1024, 1536);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                a10.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream);
                                fileOutputStream.close();
                                a10.recycle();
                                this.f27399v = 1;
                                if (f1.a(this.f27402y, this.f27403z, this.f27400w, file, this.A, this) == aVar) {
                                    return aVar;
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } catch (Exception | OutOfMemoryError unused) {
                        }
                    }
                }
                return zVar;
            default:
                int i13 = this.f27399v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    int identifier = context.getResources().getIdentifier(str2, "drawable", context.getPackageName());
                    if (identifier != 0) {
                        f1Var.getClass();
                        File file2 = new File(f1.h(context), p.a.k("cover_", str, ".jpg"));
                        try {
                            Bitmap a11 = a(context, identifier);
                            if (a11 != null) {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                try {
                                    a11.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
                                    fileOutputStream2.close();
                                    a11.recycle();
                                } finally {
                                }
                            } else {
                                Drawable drawable = context.getDrawable(identifier);
                                if (drawable != null) {
                                    Integer num2 = new Integer(drawable.getIntrinsicWidth());
                                    if (num2.intValue() <= 0) {
                                        num2 = null;
                                    }
                                    if (num2 != null) {
                                        i11 = num2.intValue();
                                    }
                                    Integer num3 = new Integer(drawable.getIntrinsicHeight());
                                    if (num3.intValue() > 0) {
                                        num = num3;
                                    }
                                    if (num != null) {
                                        i10 = num.intValue();
                                    }
                                    Bitmap createBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                                    createBitmap.getClass();
                                    Canvas canvas = new Canvas(createBitmap);
                                    drawable.setBounds(0, 0, i11, i10);
                                    drawable.draw(canvas);
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                                    try {
                                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream3);
                                        fileOutputStream3.close();
                                        createBitmap.recycle();
                                    } finally {
                                    }
                                }
                            }
                            this.f27399v = 1;
                            if (f1.a(this.f27402y, this.f27403z, this.f27400w, file2, this.A, this) == aVar) {
                                return aVar;
                            }
                        } catch (Exception | OutOfMemoryError unused2) {
                        }
                    }
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, f1 f1Var, Context context, String str2, int i, te.c cVar) {
        super(2, cVar);
        this.f27401x = str;
        this.f27402y = f1Var;
        this.f27400w = context;
        this.f27403z = str2;
        this.A = i;
    }
}
