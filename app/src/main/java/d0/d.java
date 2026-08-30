package d0;

import a0.o;
import b2.k1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends j implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f15656u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k1 f15657v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f15658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, k1 k1Var, o oVar) {
        super(0, k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f15656u = fVar;
        this.f15657v = k1Var;
        this.f15658w = oVar;
    }

    @Override // df.a
    public final Object invoke() {
        return f.Y0(this.f15656u, this.f15657v, this.f15658w);
    }
}
