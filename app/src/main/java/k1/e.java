package k1;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19472f = true;

    /* renamed from: a, reason: collision with root package name */
    public final c2.x f19473a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19474b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public o1.b f19475c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19476d;
    public final c e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ComponentCallbacks, java.lang.Object, k1.c] */
    public e(c2.x xVar) {
        this.f19473a = xVar;
        Object obj = new Object();
        this.e = obj;
        if (xVar.isAttachedToWindow()) {
            Context context = xVar.getContext();
            if (!this.f19476d) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.f19476d = true;
            }
        }
        xVar.addOnAttachStateChangeListener(new c2.a0(3, this));
    }

    @Override // k1.y
    public final void a(n1.b bVar) {
        synchronized (this.f19474b) {
            if (!bVar.f21029s) {
                bVar.f21029s = true;
                bVar.b();
            }
        }
    }

    @Override // k1.y
    public final n1.b b() {
        n1.d iVar;
        n1.b bVar;
        synchronized (this.f19474b) {
            try {
                c2.x xVar = this.f19473a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    xVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    iVar = new n1.g();
                } else if (f19472f) {
                    try {
                        iVar = new n1.e(this.f19473a, new q(), new m1.b());
                    } catch (Throwable unused) {
                        f19472f = false;
                        iVar = new n1.i(c(this.f19473a));
                    }
                } else {
                    iVar = new n1.i(c(this.f19473a));
                }
                bVar = new n1.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o1.b, o1.a, android.view.View, android.view.ViewGroup] */
    public final o1.a c(c2.x xVar) {
        o1.b bVar = this.f19475c;
        if (bVar == null) {
            ViewGroup viewGroup = new ViewGroup(xVar.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            xVar.addView((View) viewGroup, -1);
            this.f19475c = viewGroup;
            return viewGroup;
        }
        return bVar;
    }
}