package com.tamazombie.portableGame;

import com.tamazombie.concreteLogic.ParkViewModel;
import com.tamazombie.concreteModel.Player;
import com.tamazombie.concreteServices.StorageService;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.behaviors.Caching;

/**
 * Created with IntelliJ IDEA.
 * User: David Bottiau
 * Date: 12/03/14
 * Time: 01:15
 * To change this template use File | Settings | File Templates.
 */
public class IoCBootstrapper {
    /**
     * The IoC container to create Singletons
     */
    private MutablePicoContainer _singletonPicoContainer;

    /**
     * The IoC container to create Factories
     */
    private MutablePicoContainer _factoryPicoContainer;


    public IoCBootstrapper(){
        // Initialize Dependency Injection
        InitializeContainers();
        AddComponents();
    }

    /**
     * Initialize IoC containers
     */
    private void InitializeContainers( ){
        _factoryPicoContainer = new DefaultPicoContainer();
        _singletonPicoContainer = new DefaultPicoContainer(new Caching());
    }

    /**
     * Register Dependency Injection with PicoContainer
     */
    private void AddComponents() {
        // Register Model
        _singletonPicoContainer.addComponent(Player.class);

        // Register Logic (ViewModels)
        _singletonPicoContainer.addComponent(ParkViewModel.class);

        // Register Services
        _singletonPicoContainer.addComponent(StorageService.class);
    }
}
