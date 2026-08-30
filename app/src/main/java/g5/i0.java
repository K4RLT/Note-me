package g5;
import o0.b;

import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;

/* loaded from: classes.dex */
public final class i0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public pw f17457u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17458v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f17459w;

    /* renamed from: x, reason: collision with root package name */
    public int f17460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.f17459w = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17458v = obj;
        this.f17460x |= Integer.MIN_VALUE;
        return b(this.f17459w, this);
    }
}
