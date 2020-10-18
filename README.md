# RMIT SEPT 2020 Major Project

# Group fri-10-30-2

## Members
* Marcelin, Angelique (s3602636)
* Oommen, Sandra (s3794692)
* Miskimmin, Daniel (s3722763)
* Wang, Kejie (s3716098)

## Records

* Github repository : https://github.com/RMIT-SEPT/majorproject-fri-10-30-2

* Notion Workspace : https://www.notion.so/114a61fc54a6437ebadc932da842b886?v=6cec8e72ff5945d392e7da95d963588a


## Code documentation

[Quick Start](/docs/README.md) in `docs` folder

## Setting up the web service
1. Setup an RSA public/private key pair and store in $HOME/.ssh
2. Install AWS CLI, terraform, helm and kubectl
3. Create two repositories in the ECR
    * One called frontend and one called backend
    * Copy the URI's for each of the repositories for later use
4. Copy the URI's to the docker-compose.yml file with the image names being the different repositories from step 1
5. Run docker-compose build
6. Run aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin {url};
    * replace {url} with the url of the ECR repositories without the back or frontend components of the url
7. Run docker-compose push
8. cd to infra
9. Run terraform apply
10. Run kops create cluster --state=s3://$(terraform output kops_state_bucket_name) --name=project.k8s.local --zones=us-east-1a --master-size=t2.micro --node-size=t2.micro --yes --node-count=1 --ssh-public-key=$($HOME)/.ssh/id_rsa.pub            
11. Go to AWS online console and write down the kubernetes cluster's VPC_ID and subnet_id
    * Copy thing to the terraform.tfvars file in the main directory
12. Go back ot the main directory and run terraform apply
13 Go to the infra directory again and run helm packge projcet
    * Followed by helm install project project-0.1.0.tgz --set MARIADB_PASSWORD={x}
    * {x} is the password for the RDS database
