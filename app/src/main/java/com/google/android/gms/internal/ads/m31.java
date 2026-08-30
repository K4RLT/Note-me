package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class m31 extends o31 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m31(mf mfVar, CharSequence charSequence, Object obj, int i) {
        super(mfVar, charSequence);
        this.B = i;
        this.C = obj;
    }

    @Override // com.google.android.gms.internal.ads.o31
    public final int a(int i) {
        switch (this.B) {
            case 0:
                CharSequence charSequence = this.f8948w;
                int length = charSequence.length();
                b80.O(i, length);
                while (i < length) {
                    if (!((a31) this.C).a(charSequence.charAt(i))) {
                        i++;
                    } else {
                        return i;
                    }
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((lt0) this.C).f8135v;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.o31
    public final int b(int i) {
        switch (this.B) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((lt0) this.C).f8135v).end();
        }
    }
}
