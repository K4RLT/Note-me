package u7;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class r0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26772u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f26773v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f26774w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Context context, Uri uri, te.c cVar, int i) {
        super(2, cVar);
        this.f26772u = i;
        this.f26773v = context;
        this.f26774w = uri;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26772u) {
            case 0:
                return new r0(this.f26773v, this.f26774w, cVar, 0);
            default:
                return new r0(this.f26773v, this.f26774w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26772u) {
            case 0:
                return ((r0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((r0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26772u;
        Uri uri = this.f26774w;
        Context context = this.f26773v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                return f2.f(160, context, uri);
            default:
                pe.a.e(obj);
                return f2.f(200, context, uri);
        }
    }
}
