package b3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import b2.v1;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f1688u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f1689v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0.p f1690w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1.o f1691x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f1692y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ View f1693z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, df.l lVar, r0.p pVar, a1.o oVar, int i, View view) {
        super(0);
        this.f1688u = context;
        this.f1689v = lVar;
        this.f1690w = pVar;
        this.f1691x = oVar;
        this.f1692y = i;
        this.f1693z = view;
    }

    @Override // df.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f1693z;
        callback.getClass();
        return new s(this.f1688u, this.f1689v, this.f1690w, this.f1691x, this.f1692y, (v1) callback).getLayoutNode();
    }
}
