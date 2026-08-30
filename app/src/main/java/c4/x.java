package c4;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class x implements TextWatcher, SpanWatcher {

    /* renamed from: u, reason: collision with root package name */
    public final Object f3873u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f3874v = new AtomicInteger(0);

    public x(Object obj) {
        this.f3873u = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f3873u).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        ((TextWatcher) this.f3873u).beforeTextChanged(charSequence, i, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i10) {
        if (this.f3874v.get() > 0 && (obj instanceof a0)) {
            return;
        }
        ((SpanWatcher) this.f3873u).onSpanAdded(spannable, obj, i, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f3874v.get() > 0 && (obj instanceof a0)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i > i10) {
                i = 0;
            }
            if (i11 > i12) {
                i13 = i;
                i14 = 0;
                ((SpanWatcher) this.f3873u).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }
        i13 = i;
        i14 = i11;
        ((SpanWatcher) this.f3873u).onSpanChanged(spannable, obj, i13, i10, i14, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i10) {
        if (this.f3874v.get() > 0 && (obj instanceof a0)) {
            return;
        }
        ((SpanWatcher) this.f3873u).onSpanRemoved(spannable, obj, i, i10);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        ((TextWatcher) this.f3873u).onTextChanged(charSequence, i, i10, i11);
    }
}
