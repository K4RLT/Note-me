package u7;
import c.k;
import x4.a;
import f7.c;
import k1.f;
import w7.x4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class h6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26287u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f26288v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(int i, String str, te.c cVar) {
        super(2, cVar);
        this.f26287u = i;
        this.f26288v = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26287u) {
            case 0:
                return new h6(0, this.f26288v, cVar);
            case 1:
                return new h6(1, this.f26288v, cVar);
            case 2:
                return new h6(2, this.f26288v, cVar);
            case 3:
                return new h6(3, this.f26288v, cVar);
            case 4:
                return new h6(4, this.f26288v, cVar);
            default:
                return new h6(5, this.f26288v, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26287u) {
            case 0:
                h6 h6Var = (h6) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                h6Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                return ((h6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((h6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((h6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((h6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((h6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26287u;
        String str = this.f26288v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                c.k(str);
                return pe.z.f22715a;
            case 1:
                pe.a.e(obj);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 1;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    if (decodeFile == null) {
                        return null;
                    }
                    return new f(decodeFile);
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                pe.a.e(obj);
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                    if (decodeFile2 == null) {
                        return null;
                    }
                    return new f(decodeFile2);
                } catch (Exception unused2) {
                    return null;
                }
            case 3:
                pe.a.e(obj);
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = 1;
                    return BitmapFactory.decodeFile(str, options2);
                } catch (Exception unused3) {
                    return null;
                }
            case 4:
                pe.a.e(obj);
                List list = x4.f29436a;
                return x4.a(str);
            default:
                pe.a.e(obj);
                List list2 = x4.f29436a;
                return x4.a(str);
        }
    }
}
