package yellr.net.yellr_android.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import yellr.net.yellr_android.R;
import yellr.net.yellr_android.fragments.PostFragment;

public class PostActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        if (savedInstanceState == null) {
            int assID = getIntent().getExtras().getInt(PostFragment.ARG_ASSIGNMENT_ID);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PostFragment().newInstance(assID))
                    .commit();
        }
    }
}