package q7;

import android.content.Context;
import com.daren.scraply.notify.ReengagementWorker;

/* loaded from: classes.dex */
public final class k extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Context f23580u;

    /* renamed from: v, reason: collision with root package name */
    public g f23581v;

    /* renamed from: w, reason: collision with root package name */
    public int f23582w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f23583x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ReengagementWorker f23584y;

    /* renamed from: z, reason: collision with root package name */
    public int f23585z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReengagementWorker reengagementWorker, ve.c cVar) {
        super(cVar);
        this.f23584y = reengagementWorker;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f23583x = obj;
        this.f23585z |= Integer.MIN_VALUE;
        return this.f23584y.c(null, this);
    }
}
