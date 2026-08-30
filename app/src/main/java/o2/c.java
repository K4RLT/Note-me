package o2;

import java.text.BreakIterator;
import ya.k1;

/* loaded from: classes.dex */
public final class c extends k1 {

    /* renamed from: u, reason: collision with root package name */
    public final BreakIterator f21766u;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f21766u = characterInstance;
    }

    @Override // ya.k1
    public final int a(int i) {
        return this.f21766u.following(i);
    }

    @Override // ya.k1
    public final int b(int i) {
        return this.f21766u.preceding(i);
    }
}
