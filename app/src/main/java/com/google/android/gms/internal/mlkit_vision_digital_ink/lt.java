package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class lt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14634a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14635b;

    public /* synthetic */ lt(int i, Object obj) {
        this.f14634a = i;
        this.f14635b = obj;
    }

    public m a() {
        String str;
        switch (this.f14634a) {
            case 0:
                return (m) this.f14635b;
            default:
                int b10 = b();
                if (b10 != 1) {
                    if (b10 != 2) {
                        str = "DOWNLOADED_GROUP";
                    } else {
                        str = "IN_PROGRESS_FUTURE";
                    }
                } else {
                    str = "PENDING_GROUP";
                }
                throw new UnsupportedOperationException(str);
        }
    }

    public final int b() {
        switch (this.f14634a) {
            case 0:
                return 3;
            case 1:
                return 2;
            default:
                return 1;
        }
    }

    public ya c() {
        String str;
        switch (this.f14634a) {
            case 1:
                return (ya) this.f14635b;
            default:
                int b10 = b();
                if (b10 != 1) {
                    if (b10 != 2) {
                        str = "DOWNLOADED_GROUP";
                    } else {
                        str = "IN_PROGRESS_FUTURE";
                    }
                } else {
                    str = "PENDING_GROUP";
                }
                throw new UnsupportedOperationException(str);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        switch (this.f14634a) {
            case 0:
                if (obj instanceof lt) {
                    lt ltVar = (lt) obj;
                    if (ltVar.b() == 3 && ((m) this.f14635b).equals(ltVar.a())) {
                        return true;
                    }
                }
                return false;
            case 1:
                if (obj instanceof lt) {
                    lt ltVar2 = (lt) obj;
                    if (ltVar2.b() == 2 && ((ya) this.f14635b).equals(ltVar2.c())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof lt) {
                    lt ltVar3 = (lt) obj;
                    if (ltVar3.b() == 1) {
                        tr trVar = (tr) this.f14635b;
                        switch (ltVar3.f14634a) {
                            case 2:
                                if (trVar.equals((tr) ltVar3.f14635b)) {
                                    return true;
                                }
                                break;
                            default:
                                int b10 = ltVar3.b();
                                if (b10 != 1) {
                                    if (b10 != 2) {
                                        str = "DOWNLOADED_GROUP";
                                    } else {
                                        str = "IN_PROGRESS_FUTURE";
                                    }
                                } else {
                                    str = "PENDING_GROUP";
                                }
                                throw new UnsupportedOperationException(str);
                        }
                    }
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f14634a) {
            case 0:
                return ((m) this.f14635b).hashCode();
            case 1:
                return ((ya) this.f14635b).hashCode();
            default:
                return ((tr) this.f14635b).hashCode();
        }
    }
}
