package w7;
import b2.f1;
import r0.a1;
import r0.i0;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x2 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f29427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29428d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f29429f;

    public x2(boolean z3, u7.m3 m3Var, a1 a1Var, int i, int i10, kotlin.jvm.internal.y yVar) {
        this.f29425a = z3;
        this.f29426b = m3Var;
        this.f29427c = a1Var;
        this.f29428d = i;
        this.e = i10;
        this.f29429f = yVar;
    }

    @Override // i0
    public final void a() {
        String str = (String) this.f29427c.getValue();
        u7.m3 m3Var = this.f29426b;
        if (str != null) {
            m3Var.t(this.f29428d, this.e, (Context) this.f29429f.f19787u, str);
        }
        if (this.f29425a) {
            f1 f1Var = m3Var.f26541o;
            b1.v vVar = (b1.v) f1Var.C;
            b1.v vVar2 = (b1.v) f1Var.B;
            ListIterator listIterator = vVar2.listIterator();
            while (true) {
                b1.c0 c0Var = (b1.c0) listIterator;
                if (!c0Var.hasNext()) {
                    break;
                } else {
                    ((Bitmap) c0Var.next()).recycle();
                }
            }
            ListIterator listIterator2 = vVar.listIterator();
            while (true) {
                b1.c0 c0Var2 = (b1.c0) listIterator2;
                if (c0Var2.hasNext()) {
                    ((Bitmap) c0Var2.next()).recycle();
                } else {
                    vVar2.clear();
                    vVar.clear();
                    return;
                }
            }
        }
    }
}
