package e6;

import a6.q;
import a6.r;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f15922c = q.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f15923a;

    /* renamed from: b, reason: collision with root package name */
    public final r f15924b;

    public a(Context context, r rVar) {
        this.f15924b = rVar;
        this.f15923a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
