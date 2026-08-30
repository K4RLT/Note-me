package a6;

import android.app.Notification;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f276b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f277c;

    public h(int i, Notification notification, int i10) {
        this.f275a = i;
        this.f277c = notification;
        this.f276b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f275a == hVar.f275a && this.f276b == hVar.f276b) {
                return this.f277c.equals(hVar.f277c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f277c.hashCode() + (((this.f275a * 31) + this.f276b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f275a + ", mForegroundServiceType=" + this.f276b + ", mNotification=" + this.f277c + '}';
    }
}
