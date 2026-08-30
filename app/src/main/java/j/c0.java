package j;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class c0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f18619a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f18620b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f18621c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f18622d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18623f;

    public c0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f18620b = rect3;
        Rect rect4 = new Rect();
        this.f18622d = rect4;
        Rect rect5 = new Rect();
        this.f18621c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f18619a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z9;
        int x9 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z9 = this.f18623f;
                    this.f18623f = false;
                }
                z3 = true;
                z10 = false;
            } else {
                z9 = this.f18623f;
                if (z9 && !this.f18622d.contains(x9, y10)) {
                    z10 = z9;
                    z3 = false;
                }
            }
            z10 = z9;
            z3 = true;
        } else {
            if (this.f18620b.contains(x9, y10)) {
                this.f18623f = true;
                z3 = true;
            }
            z3 = true;
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Rect rect = this.f18621c;
        View view = this.f18619a;
        if (z3 && !rect.contains(x9, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x9 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
