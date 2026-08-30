package n0;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import k1.r;

/* loaded from: classes.dex */
public final class p extends RippleDrawable {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21006u;

    /* renamed from: v, reason: collision with root package name */
    public r f21007v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f21008w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21009x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.f21006u = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.p.<init>(boolean):void");
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f21006u) {
            this.f21009x = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f21009x = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f21009x;
    }
}
