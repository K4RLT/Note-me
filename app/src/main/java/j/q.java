package j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class q implements TextWatcher {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SearchView f18677u;

    public q(SearchView searchView) {
        this.f18677u = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        SearchView searchView = this.f18677u;
        Editable text = searchView.J.getText();
        searchView.f399s0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.p(!isEmpty);
        int i12 = 8;
        if (searchView.f398r0 && !searchView.f393k0 && isEmpty) {
            searchView.O.setVisibility(8);
            i12 = 0;
        }
        searchView.Q.setVisibility(i12);
        searchView.l();
        searchView.o();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
