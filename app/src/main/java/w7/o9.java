package w7;
import w7.o9;

import android.content.Context;

/* loaded from: classes.dex */
public final class o9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28854u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f28855v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f28856w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ma f28857x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f28858y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(Context context, ma maVar, String str, te.c cVar, int i) {
        super(2, cVar);
        this.f28854u = i;
        this.f28856w = context;
        this.f28857x = maVar;
        this.f28858y = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f28854u) {
            case 0:
                o9 o9Var = new o9(this.f28856w, this.f28857x, this.f28858y, cVar, 0);
                o9Var.f28855v = obj;
                return o9Var;
            default:
                o9 o9Var2 = new o9(this.f28856w, this.f28857x, this.f28858y, cVar, 1);
                o9Var2.f28855v = obj;
                return o9Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f28854u) {
            case 0:
                return ((o9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((o9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.o9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
