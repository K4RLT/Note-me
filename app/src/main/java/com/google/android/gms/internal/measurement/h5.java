package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class h5 extends IOException {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.h5, java.io.IOException] */
    public static h5 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.h5, java.io.IOException] */
    public static h5 b() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.h5, java.io.IOException] */
    public static h5 c() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.h5, java.io.IOException] */
    public static h5 d() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
