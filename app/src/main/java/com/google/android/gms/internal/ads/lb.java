package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8000c = mb.f8298a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8001a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f8002b = false;

    public final synchronized void a(long j10, String str) {
        if (!this.f8002b) {
            this.f8001a.add(new kb(j10, SystemClock.elapsedRealtime(), str));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void b(String str) {
        long j10;
        this.f8002b = true;
        ArrayList arrayList = this.f8001a;
        int i = 0;
        if (arrayList.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((kb) arrayList.get(arrayList.size() - 1)).f7704c - ((kb) arrayList.get(0)).f7704c;
        }
        if (j10 > 0) {
            long j11 = ((kb) arrayList.get(0)).f7704c;
            mb.b("(%-4d ms) %s", Long.valueOf(j10), str);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kb kbVar = (kb) obj;
                long j12 = kbVar.f7704c;
                mb.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(kbVar.f7703b), kbVar.f7702a);
                j11 = j12;
            }
        }
    }

    public final void finalize() {
        if (!this.f8002b) {
            b("Request on the loose");
            mb.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
