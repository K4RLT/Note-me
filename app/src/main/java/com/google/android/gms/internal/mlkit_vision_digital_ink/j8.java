package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class j8 extends f7 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final MessageDigest f14503w;

    /* renamed from: x, reason: collision with root package name */
    public final int f14504x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f14505y;

    /* renamed from: z, reason: collision with root package name */
    public final String f14506z;

    public j8() {
        boolean z3;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f14503w = messageDigest;
            this.f14504x = messageDigest.getDigestLength();
            this.f14506z = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z3 = true;
            } catch (CloneNotSupportedException unused) {
                z3 = false;
            }
            this.f14505y = z3;
        } catch (NoSuchAlgorithmException e) {
            g5.q.f(e);
            throw null;
        }
    }

    public final i8 t() {
        boolean z3 = this.f14505y;
        int i = this.f14504x;
        MessageDigest messageDigest = this.f14503w;
        if (z3) {
            try {
                return new i8((MessageDigest) messageDigest.clone(), i);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new i8(MessageDigest.getInstance(messageDigest.getAlgorithm()), i);
        } catch (NoSuchAlgorithmException e) {
            g5.q.f(e);
            return null;
        }
    }

    public final String toString() {
        return this.f14506z;
    }
}
