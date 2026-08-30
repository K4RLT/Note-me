package u7;
import u7.l3;

import android.content.Context;

/* loaded from: classes.dex */
public final class l3 extends ve.i implements df.p {
    public final /* synthetic */ df.l A;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26480u;

    /* renamed from: v, reason: collision with root package name */
    public int f26481v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26482w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26483x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f26484y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f26485z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(m3 m3Var, int i, Context context, String str, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f26482w = m3Var;
        this.f26483x = i;
        this.f26484y = context;
        this.f26485z = str;
        this.A = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new l3(this.f26482w, this.f26483x, this.f26484y, this.f26485z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fd, code lost:
    
        if (r4 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ff, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        if (r4 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        if (r3 == r11) goto L41;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
