package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import q.x;
import x.n;

/* loaded from: classes.dex */
public enum av {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);


    /* renamed from: u, reason: collision with root package name */
    public final int f14040u;

    av(int i) {
        this.f14040u = i;
    }

    public static av a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return USE_CHECKSUM_ONLY;
                }
                q.x.n(g3.a.g(i, "Unknown MDD FileKey version:"));
                return null;
            }
            return ADD_DOWNLOAD_TRANSFORM;
        }
        return NEW_FILE_KEY;
    }
}
