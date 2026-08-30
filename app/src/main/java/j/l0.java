package j;
import j.l0;
import j.m0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.daren.scraply.R;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static l0 E;
    public static l0 F;
    public int A;
    public m0 B;
    public boolean C;
    public boolean D;

    /* renamed from: u, reason: collision with root package name */
    public final View f18650u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f18651v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18652w;

    /* renamed from: x, reason: collision with root package name */
    public final k0 f18653x;

    /* renamed from: y, reason: collision with root package name */
    public final k0 f18654y;

    /* renamed from: z, reason: collision with root package name */
    public int f18655z;

    /* JADX WARN: Type inference failed for: r0v0, types: [j.k0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [j.k0] */
    public l0(ImageView imageView, String str) {
        int scaledTouchSlop;
        final int i = 0;
        this.f18653x = new Runnable(this) { // from class: j.k0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0 f18649v;

            {
                this.f18649v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f18649v.c(false);
                        return;
                    default:
                        this.f18649v.a();
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f18654y = new Runnable(this) { // from class: j.k0

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l0 f18649v;

            {
                this.f18649v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f18649v.c(false);
                        return;
                    default:
                        this.f18649v.a();
                        return;
                }
            }
        };
        this.f18650u = imageView;
        this.f18651v = str;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(imageView.getContext());
        Method method = q3.q.f23421a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = f3.k.k(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f18652w = scaledTouchSlop;
        this.D = true;
        imageView.setOnLongClickListener(this);
        imageView.setOnHoverListener(this);
    }

    public static void b(l0 l0Var) {
        l0 l0Var2 = E;
        if (l0Var2 != null) {
            l0Var2.f18650u.removeCallbacks(l0Var2.f18653x);
        }
        E = l0Var;
        if (l0Var != null) {
            l0Var.f18650u.postDelayed(l0Var.f18653x, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l0 l0Var = F;
        View view = this.f18650u;
        if (l0Var == this) {
            F = null;
            m0 m0Var = this.B;
            if (m0Var != null) {
                View view2 = (View) m0Var.f18663v;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m0Var.f18662u).getSystemService("window")).removeView(view2);
                }
                this.B = null;
                this.D = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (E == this) {
            b(null);
        }
        view.removeCallbacks(this.f18654y);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [m0, java.lang.Object] */
    public final void c(boolean z3) {
        int height;
        int i;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j10;
        long j11;
        boolean z10 = q3.p.f23420a;
        View view = this.f18650u;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        l0 l0Var = F;
        if (l0Var != null) {
            l0Var.a();
        }
        F = this;
        this.C = z3;
        Context context = view.getContext();
        Object obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f18665x = layoutParams;
        obj.f18666y = new Rect();
        obj.f18667z = new int[2];
        obj.A = new int[2];
        obj.f18662u = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f18663v = inflate;
        obj.f18664w = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(m0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
        View view2 = (View) obj.f18663v;
        Context context2 = (Context) obj.f18662u;
        this.B = obj;
        int i15 = this.f18655z;
        int i16 = this.A;
        boolean z11 = this.C;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f18665x;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f18664w).setText(this.f18651v);
        int[] iArr = (int[]) obj.A;
        int[] iArr2 = (int[]) obj.f18667z;
        Rect rect = (Rect) obj.f18666y;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i16 + dimensionPixelOffset2;
            i = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z11) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i17 = i15;
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                }
                if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i13 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i13 = 1;
                i11 = i;
                z9 = z11;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i14 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i14 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i;
                z9 = z11;
                i12 = 0;
                i13 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i18;
            iArr2[i13] = iArr2[i13] - iArr[i13];
            layoutParams2.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[i13];
            int i20 = ((i19 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z9) {
                if (i20 >= 0) {
                    layoutParams2.y = i20;
                } else {
                    layoutParams2.y = i21;
                }
            } else if (measuredHeight + i21 <= rect.height()) {
                layoutParams2.y = i21;
            } else {
                layoutParams2.y = i20;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.C) {
            j11 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        k0 k0Var = this.f18654y;
        view.removeCallbacks(k0Var);
        view.postDelayed(k0Var, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.A) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m0 r4 = r3.B
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.C
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f18650u
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.D = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m0 r4 = r3.B
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.D
            if (r1 != 0) goto L66
            int r1 = r3.f18655z
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f18652w
            if (r1 > r2) goto L66
            int r1 = r3.A
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f18655z = r4
            r3.A = r5
            r3.D = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.l0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f18655z = view.getWidth() / 2;
        this.A = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}