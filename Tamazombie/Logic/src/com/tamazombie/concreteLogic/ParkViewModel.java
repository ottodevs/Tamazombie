package com.tamazombie.concreteLogic;

import com.tamazombie.abstractLogic.IParkViewModel;
import com.tamazombie.abstractModel.IPlayer;

/**
 * Created with IntelliJ IDEA.
 * User: David Bottiau
 * Date: 11/03/14
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public final class ParkViewModel implements IParkViewModel {
    private IPlayer _player;
    private float _hungryRatePerSecond = 0.5f;
    private float _hungryByMeal = 50f;

    public ParkViewModel(IPlayer player){
        _player = player;
    }

    @Override
    public IPlayer GetPlayer() {
        return _player;
    }

    @Override
    public void PlayerMove(float deltaTime) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void PlayerHungry(float deltaTime) {
        /*if (_player.GetGameMode() == GameMode.ZombieMode)
            _player.SetHungry(_player.GetHungry() + (deltaTime * _hungryRatePerSecond));
        if (_player.GetGameMode() == GameMode.HumanMode)
            _player.SetHungry(_player.GetHungry() - (deltaTime * _hungryRatePerSecond));*/
    }

    @Override
    public void PlayerEat(float deltaTime) {
        /*if (_player.GetGameMode() == GameMode.ZombieMode)
            _player.SetHungry(_player.GetHungry() - _hungryByMeal);
        if (_player.GetGameMode() == GameMode.HumanMode)
            _player.SetHungry(_player.GetHungry() + _hungryByMeal);*/
    }

    @Override
    public void PlayerDivert(float deltaTime) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void PlayerDie(float deltaTime) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void GoToTown() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
