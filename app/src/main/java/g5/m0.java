package g5;

import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;

/* loaded from: classes.dex */
public final class m0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public pw f17485u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17486v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f17487w;

    /* renamed from: x, reason: collision with root package name */
    public int f17488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, ve.c cVar) {
        super(cVar);
        this.f17487w = o0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f17486v = obj;
        this.f17488x |= Integer.MIN_VALUE;
        return this.f17487w.f(this);
    }
}
