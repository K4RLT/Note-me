package f3;

import a0.f0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.daren.scraply.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16661a;
    public CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16665f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f16666g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f16667h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f16668j;

    /* renamed from: l, reason: collision with root package name */
    public j f16670l;

    /* renamed from: n, reason: collision with root package name */
    public String f16672n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f16673o;

    /* renamed from: r, reason: collision with root package name */
    public String f16676r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f16677s;

    /* renamed from: t, reason: collision with root package name */
    public final Notification f16678t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16679u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f16680v;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16662b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16663c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16664d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f16669k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16671m = false;

    /* renamed from: p, reason: collision with root package name */
    public int f16674p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f16675q = 0;

    public i(Context context, String str) {
        Notification notification = new Notification();
        this.f16678t = notification;
        this.f16661a = context;
        this.f16676r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f16668j = 0;
        this.f16680v = new ArrayList();
        this.f16677s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        f0 f0Var = new f0(this);
        i iVar = (i) f0Var.e;
        j jVar = iVar.f16670l;
        if (jVar != null) {
            jVar.a(f0Var);
        }
        int i = f0Var.f47b;
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) f0Var.f49d;
        if (i10 >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
            if (i != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
        }
        if (jVar != null) {
            iVar.f16670l.getClass();
        }
        if (jVar != null && (bundle = build.extras) != null) {
            if (jVar.f16683c) {
                bundle.putCharSequence("android.summaryText", jVar.f16682b);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", jVar.b());
        }
        return build;
    }

    public final void c(int i, boolean z3) {
        Notification notification = this.f16678t;
        if (z3) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f16661a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f662k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f664b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f16667h = iconCompat;
    }

    public final void e(j jVar) {
        if (this.f16670l != jVar) {
            this.f16670l = jVar;
            if (jVar.f16681a != this) {
                jVar.f16681a = this;
                e(jVar);
            }
        }
    }
}
