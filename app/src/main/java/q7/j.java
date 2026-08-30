package q7;

import com.daren.scraply.notify.ReengagementWorker;

/* loaded from: classes.dex */
public final class j extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f23577u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ReengagementWorker f23578v;

    /* renamed from: w, reason: collision with root package name */
    public int f23579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ReengagementWorker reengagementWorker, ve.c cVar) {
        super(cVar);
        this.f23578v = reengagementWorker;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f23577u = obj;
        this.f23579w |= Integer.MIN_VALUE;
        return this.f23578v.a(this);
    }
}
