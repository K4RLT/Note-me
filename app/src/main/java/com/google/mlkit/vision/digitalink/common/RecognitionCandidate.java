package com.google.mlkit.vision.digitalink.common;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class RecognitionCandidate {

    /* renamed from: a, reason: collision with root package name */
    public final String f15624a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f15625b;

    public RecognitionCandidate(byte[] bArr, float f10) {
        this.f15624a = new String(bArr, StandardCharsets.UTF_8);
        this.f15625b = Float.valueOf(f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecognitionCandidate)) {
            return false;
        }
        RecognitionCandidate recognitionCandidate = (RecognitionCandidate) obj;
        if (Objects.equals(this.f15624a, recognitionCandidate.f15624a) && Objects.equals(this.f15625b, recognitionCandidate.f15625b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15624a, this.f15625b);
    }

    public final String toString() {
        return "\"" + this.f15624a + "\": " + this.f15625b;
    }

    public RecognitionCandidate(byte[] bArr) {
        this.f15624a = new String(bArr, StandardCharsets.UTF_8);
        this.f15625b = null;
    }

    public RecognitionCandidate() {
        this.f15624a = "";
        this.f15625b = null;
    }
}
