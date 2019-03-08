package com.wolf.sambuddhadhar.newsapp.application;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import android.app.Application;
import com.wolf.sambuddhadhar.newsapp.application.ApplicationComponent.ApplicationScope;
import dagger.BindsInstance;
import dagger.Component;
import java.lang.annotation.Retention;
import javax.inject.Scope;

@ApplicationScope
@Component(modules = AppModule.class)
public interface ApplicationComponent {


  void inject(NewsApplication newsApplication);

  @Scope
  @Retention(RUNTIME)
  @interface ApplicationScope {}

  @Component.Builder
  interface Builder {

    @BindsInstance
    ApplicationComponent.Builder application(Application application);

    ApplicationComponent build();
  }
}