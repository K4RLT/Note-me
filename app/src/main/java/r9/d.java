package r9;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24667a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24668b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f24669c = new AtomicReference(a.UNKNOWN);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f24670d = new AtomicReference(b.UNKNOWN);
    public final AtomicReference e = new AtomicReference(c.UNKNOWN);

    public d(Context context) {
        this.f24667a = context;
    }
}
