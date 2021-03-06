package none.healthaide.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import none.healthaide.R;
import none.healthaide.model.Feature;

public class FeatureViewHolder {
    @BindView(R.id.feature_icon)
    ImageView featureIconImageView;
    @BindView(R.id.feature_name)
    TextView featureNameTextView;

    public FeatureViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void init(Feature feature) {
        this.featureIconImageView.setImageResource(feature.getIconRes());
        this.featureNameTextView.setText(feature.getName());
    }
}
