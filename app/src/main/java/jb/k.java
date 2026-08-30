package jb;

import q.x;

/* loaded from: classes.dex */
public final class k {
    /* JADX WARN: Type inference failed for: r0v4, types: [jb.k, java.lang.Object] */
    public static k a() {
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" appUpdateType");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" allowAssetPackDeletion");
            }
            x.o("Missing required properties:".concat(sb2.toString()));
            return null;
        }
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -722378861;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=1, allowAssetPackDeletion=false}";
    }
}
