package nf;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: u, reason: collision with root package name */
    public final TimeUnit f21341u;

    d(TimeUnit timeUnit) {
        this.f21341u = timeUnit;
    }
}
